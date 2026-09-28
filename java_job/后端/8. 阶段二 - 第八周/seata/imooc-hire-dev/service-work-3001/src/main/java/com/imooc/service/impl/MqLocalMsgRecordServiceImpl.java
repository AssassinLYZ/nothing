
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.MqLocalMsgRecordMapper;
import com.imooc.pojo.MqLocalMsgRecord;
import com.imooc.service.MqLocalMsgRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 风间影月
 * @since 2022-11-08
 */
@Service
public class MqLocalMsgRecordServiceImpl extends ServiceImpl<MqLocalMsgRecordMapper, MqLocalMsgRecord> implements MqLocalMsgRecordService {

    @Autowired
    public MqLocalMsgRecordMapper msgRecordMapper;

    @Override
    public List<MqLocalMsgRecord> getBatchLocalMsgRecordList(List msgIds) {
        return msgRecordMapper.selectBatchIds(msgIds);
    }

    @Override
    public int deleteLocalMsgRecord(String msgId) {



        return 0;
    }
}
