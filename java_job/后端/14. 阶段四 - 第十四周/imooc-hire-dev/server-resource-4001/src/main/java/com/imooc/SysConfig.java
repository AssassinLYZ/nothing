
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc;

import com.imooc.base.BaseInfoProperties;
import com.imooc.exceptions.GraceException;
import com.imooc.grace.result.ResponseStatusEnum;
import com.imooc.pojo.SysParams;
import com.imooc.service.SysParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * 通过监听接口的方式，启动服务，服务初始化之后，执行方法
 */
@Configuration
public class SysConfig extends BaseInfoProperties implements CommandLineRunner {

    @Autowired
    private SysParamsService sysParamsService;

    @Override
    public void run(String... args) throws Exception {
        SysParams sysParams =  sysParamsService.getSysParams();
        if (sysParams == null) GraceException.display(ResponseStatusEnum.SYS_DATA_ERROR);
        this.dealMaxResumeRefreshCounts(sysParams.getMaxResumeRefreshCounts());
    }

    private void dealMaxResumeRefreshCounts(int counts) {
        // 1. 把数据预热存储到redis中
        redis.set(REDIS_MAX_RESUME_REFRESH_COUNTS, counts+"");
    }
}
