
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.api.feign;

import com.imooc.grace.result.GraceJSONResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("work-service")    // 告诉springcloud容器，本接口为调用远程服务的service（声明式客户端远程调用）
public interface WorkMicroServiceFeign {

    @PostMapping("/resume/init")
    public GraceJSONResult init(@RequestParam("userId") String userId);

}
