
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service.impl;

import com.imooc.mapper.ResumeMapper;
import com.imooc.pojo.Resume;
import com.imooc.service.MqLocalMsgRecordService;
import com.imooc.service.ResumeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Slf4j
@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;

    @Autowired
    private MqLocalMsgRecordService recordService;

    @Transactional
    @Override
    public void initResume(String userId) {
        Resume resume = new Resume();
        resume.setUserId(userId);
        resume.setCreateTime(LocalDateTime.now());
        resume.setUpdatedTime(LocalDateTime.now());

        resumeMapper.insert(resume);
    }

    @Transactional
    @Override
    public void initResume(String userId, String msgId) {
        Resume resume = new Resume();
        resume.setUserId(userId);
        resume.setCreateTime(LocalDateTime.now());
        resume.setUpdatedTime(LocalDateTime.now());


        // 模拟除零异常
//        int a = 1 / 0;


        resumeMapper.insert(resume);

        // 最终一致性测试：resumeId的最后一位如果是单数，则抛出异常，如果是偶数则正常入库
        String resumeId = resume.getId();
        String tail = resumeId.substring(resumeId.length()-1);
        Integer tailNum = Integer.valueOf(tail);
        if (tailNum % 2 == 0) {
            log.info("简历初始化成功...");

            // 删除对应的本地消息表记录
            log.info("本地消息删除，tailNum为{}，该消息id为{}", tailNum, msgId);
            recordService.removeById(msgId);
        } else {
            log.error("简历初始化失败...，tailNum为{}，该消息id为{}", tailNum, msgId);
            throw new RuntimeException("简历初始化失败...");
        }
    }
}
