
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service;

import com.imooc.pojo.Users;
import com.imooc.pojo.bo.ModifyUserBO;
import com.imooc.utils.PagedGridResult;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

    /**
     * 修改用户信息
     * @param userBO
     */
    public void modifyUserInfo(ModifyUserBO userBO);

    /**
     * 获得用户信息
     * @param uid
     * @return
     */
    public Users getById(String uid);

    /**
     * 查询企业下HR数量
     * @param companyId
     * @return
     */
    public Long getCountsByCompanyId(String companyId);

    /**
     * 更新用户的企业id（绑定公司与hr的关系）
     * @param hrUserId
     * @param realname
     * @param companyId
     */
    public void updateUserCompanyId(String hrUserId,
                                    String realname,
                                    String companyId);


    /**
     * 企业审核成功，修改用户角色为hr
     * @param uid
     */
    public void updateUserToHR(String uid);

    /**
     * 修改用户角色为普通用户
     * @param hrUserId
     */
    public void updateUserToCand(String hrUserId);

    /**
     * 分页查询hr列表
     * @param companyId
     * @param page
     * @param limit
     */
    public PagedGridResult getHRList(String companyId,
                                     Integer page,
                                     Integer limit);
}
