
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.Users;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 风间影月
 * @since 2022-09-04
 */
public interface UsersService extends IService<Users> {

    /**
     * 判断用户是否存在，如果存在则返回用户信息，否则null
     * @param mobile
     * @return
     */
    public Users queryMobileIsExist(String mobile);

    /**
     * 创建用户信息，并且返回用户对象
     * @param mobile
     * @return
     */
    public Users createUsers(String mobile);

    /**
     * 消息一致性
     * @param mobile
     * @return
     */
    public Users createUsersAndInitReusmeMQ(String mobile);

}
