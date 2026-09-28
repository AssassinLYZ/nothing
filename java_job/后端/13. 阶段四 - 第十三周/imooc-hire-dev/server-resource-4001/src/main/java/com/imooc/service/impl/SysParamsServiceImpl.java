
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.base.BaseInfoProperties;
import com.imooc.mapper.SysParamsMapper;
import com.imooc.pojo.SysParams;
import com.imooc.service.SysParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 系统参数配置表，本表仅有一条记录 服务实现类
 * </p>
 *
 * @author 风间影月
 * @since 2022-09-04
 */
@Service
public class SysParamsServiceImpl extends BaseInfoProperties implements SysParamsService {

    @Autowired
    private SysParamsMapper sysParamsMapper;

    @Transactional
    @Override
    public void updateMaxResumeRefreshCounts(Integer maxCounts, Integer version) {

        SysParams params = new SysParams();
        params.setId(SYS_PARAMS_PK);
        params.setMaxResumeRefreshCounts(maxCounts);

        sysParamsMapper.updateById(params);
    }

    @Override
    public SysParams getSysParams() {
        return sysParamsMapper.selectById(SYS_PARAMS_PK);
    }
}
