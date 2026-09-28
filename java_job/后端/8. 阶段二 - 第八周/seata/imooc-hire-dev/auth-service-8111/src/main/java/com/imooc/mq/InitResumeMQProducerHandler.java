
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.mq;

import com.imooc.pojo.MqLocalMsgRecord;
import com.imooc.service.MqLocalMsgRecordService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * MQ消息处理助手
 */
@Component
public class InitResumeMQProducerHandler {

    // 存储本地消息id列表
    private ThreadLocal<List<String>> msgIdsThreadLocal = new ThreadLocal<>();

    @Autowired
    public MqLocalMsgRecordService mqLocalMsgRecordService;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 保存消息到本地
     */
    public void saveLocalMsg(String targetExchange, String routingKey, String msgContent) {

        MqLocalMsgRecord record = new MqLocalMsgRecord();
        record.setTargetExchange(targetExchange);
        record.setRoutingKey(routingKey);
        record.setMsgContent(msgContent);
        record.setCreatedTime(LocalDateTime.now());
        record.setUpdatedTime(LocalDateTime.now());

        mqLocalMsgRecordService.save(record);

        // 从ThreadLocal获得本地消息id列表，如果为空则初始化
        List<String> msgIds = msgIdsThreadLocal.get();
        if (CollectionUtils.isEmpty(msgIds)) {
            msgIds = new ArrayList<>();
        }
        // 每次消息发送后，都存储在当前线程中，事务提交后可以对其进行检查
        msgIds.add(record.getId());
        msgIdsThreadLocal.set(msgIds);
    }


    /**
     * 发送本地所有的消息到MQ（包含未消费的失败消息）
     */
    public void sendAllLocalMsg() {

        List<String> msgIds = msgIdsThreadLocal.get();
        if (CollectionUtils.isEmpty(msgIds)) {
            // 如果为空，那么则可能并不是当前业务所需要进行消息发送的，所以事务提交以后就直接完结了。
            return;
        }

        // 根据msgIds获得当前的数据库本地消息记录
        List<MqLocalMsgRecord> msgRecords = mqLocalMsgRecordService.getBatchLocalMsgRecordList(msgIds);
        // 循环发送消息记录
        for (MqLocalMsgRecord record : msgRecords) {
            rabbitTemplate.convertAndSend(
                    record.getTargetExchange(),
                    record.getRoutingKey(),
                    record.getMsgContent() + "," + record.getId());
        }
    }

}
