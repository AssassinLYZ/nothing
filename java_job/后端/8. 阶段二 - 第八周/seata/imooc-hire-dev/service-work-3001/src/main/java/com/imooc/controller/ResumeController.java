
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.controller;

import com.imooc.grace.result.GraceJSONResult;
import com.imooc.service.ResumeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    /**
     * 初始化用户简历
     * @param userId
     * @return
     */
    @PostMapping("init")
    public GraceJSONResult init(@RequestParam("userId") String userId) {
        resumeService.initResume(userId);
        return GraceJSONResult.ok();
    }

}
