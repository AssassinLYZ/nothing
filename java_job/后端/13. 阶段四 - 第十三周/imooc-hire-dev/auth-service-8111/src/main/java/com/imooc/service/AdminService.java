
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.Admin;
import com.imooc.pojo.bo.AdminBO;

/**
 * <p>
 * 慕聘网运营管理系统的admin账户表，仅登录，不提供注册 服务类
 * </p>
 *
 * @author 风间影月
 * @since 2022-09-04
 */
public interface AdminService extends IService<Admin> {

    /**
     * admin 登录
     * @param adminBO
     * @return
     */
    public boolean adminLogin(AdminBO adminBO);

    /**
     * 获得admin信息
     * @param adminBO
     * @return
     */
    public Admin getAdminInfo(AdminBO adminBO);
}
