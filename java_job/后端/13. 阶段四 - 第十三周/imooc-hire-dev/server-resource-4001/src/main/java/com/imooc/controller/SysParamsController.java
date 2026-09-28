
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.controller;

import com.imooc.grace.result.GraceJSONResult;
import com.imooc.grace.result.ResponseStatusEnum;
import com.imooc.pojo.SysParams;
import com.imooc.pojo.vo.SysParamsVO;
import com.imooc.service.SysParamsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sys")
public class SysParamsController {

    @Autowired
    private SysParamsService sysParamsService;

    /**
     * 更新简历的最大刷新次数
     * @param maxCounts
     * @param version
     * @return
     */
    @PostMapping("modifyMaxResumeRefreshCounts")
    public GraceJSONResult modifyMaxResumeRefreshCounts(Integer maxCounts, Integer version) {

        if (maxCounts == null || maxCounts < 1)
            return GraceJSONResult.errorCustom(
                    ResponseStatusEnum.SYSTEM_PARAMS_SETTINGS_ERROR);

        sysParamsService.updateMaxResumeRefreshCounts(maxCounts, version);

        // TODO version zk的乐观锁机制（后面再讲）
        return GraceJSONResult.ok(0);
    }

    /**
     * 获得参数
     * @return
     */
    @PostMapping("params")
    public GraceJSONResult params() {

        SysParams sysParams = sysParamsService.getSysParams();

        SysParamsVO sysParamsVO = new SysParamsVO();
        BeanUtils.copyProperties(sysParams, sysParamsVO);
        sysParamsVO.setVersion(0);

        return GraceJSONResult.ok(sysParamsVO);
    }

}
