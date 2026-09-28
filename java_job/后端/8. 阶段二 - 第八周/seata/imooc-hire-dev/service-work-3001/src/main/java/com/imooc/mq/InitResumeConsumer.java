
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.mq;

import com.imooc.api.mq.InitResumeMQConfig;
import com.imooc.service.MqLocalMsgRecordService;
import com.imooc.service.ResumeService;
import com.imooc.utils.SMSUtils;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class InitResumeConsumer {

    @Autowired
    private ResumeService resumeService;

    @RabbitListener(queues = {InitResumeMQConfig.INIT_RESUME_QUEUE})
    public void watchQueue(Message message, Channel channel) throws Exception {

            String routingKey = message.getMessageProperties().getReceivedRoutingKey();
            log.info("routingKey = " + routingKey);
            String msg = new String(message.getBody());
            log.info("msg = " + msg);

            String userId = msg.split(",")[0];
            String msgId = msg.split(",")[1];

        try {
            if (routingKey.equalsIgnoreCase(InitResumeMQConfig.ROUTING_KEY_INIT_RESUME)) {
                resumeService.initResume(userId, msgId);

                // 运行成功，ack确认
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
                log.info("手动ack确认成功，消息id为{}", msgId);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 出问题，则重回队列
            channel.basicNack(message.getMessageProperties().getDeliveryTag(),
                    true,
                    true);
            log.info("手动ack确认失败，消息id为{}", msgId);
        }
    }
}
