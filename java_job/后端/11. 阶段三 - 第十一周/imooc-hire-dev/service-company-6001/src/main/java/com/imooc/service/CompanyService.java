
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.Company;
import com.imooc.pojo.CompanyPhoto;
import com.imooc.pojo.bo.CreateCompanyBO;
import com.imooc.pojo.bo.ModifyCompanyInfoBO;
import com.imooc.pojo.bo.QueryCompanyBO;
import com.imooc.pojo.bo.ReviewCompanyBO;
import com.imooc.pojo.vo.CompanyInfoVO;
import com.imooc.utils.PagedGridResult;

/**
 * <p>
 * 企业表 服务类
 * </p>
 *
 * @author 风间影月
 * @since 2022-09-04
 */
public interface CompanyService {

    /**
     * 根据企业全称查询企业信息
     * @param fullName
     * @return
     */
    public Company getByFullName(String fullName);

    /**
     * 创建企业（状态：未发起审核）
     * @param createCompanyBO
     * @return
     */
    public String createNewCompany(CreateCompanyBO createCompanyBO);

    /**
     * 重启发起审核，修改企业（状态：未发起审核）
     * @param createCompanyBO
     * @return
     */
    public String resetNewCompany(CreateCompanyBO createCompanyBO);

    /**
     * 根据企业id获得企业信息
     * @param id
     * @return
     */
    public Company getById(String id);

    /**
     * 审核提交的企业信息
     * @param reviewCompanyBO
     */
    public void commitReviewCompanyInfo(ReviewCompanyBO reviewCompanyBO);

    /**
     * admin在运营平台查询企业列表
     * @param companyBO
     * @param page
     * @param limit
     * @return
     */
    public PagedGridResult queryCompanyListPaged(QueryCompanyBO companyBO,
                                                 Integer page,
                                                 Integer limit);

    /**
     * 根据企业id查询数据库获得最新企业信息
     * @param companyId
     * @return
     */
    public CompanyInfoVO getCompanyInfo(String companyId);

    /**
     * 更新审核后的信息
     * @param reviewCompanyBO
     */
    public void updateReviewInfo(ReviewCompanyBO reviewCompanyBO);

    /**
     * 修改企业信息
     * @param companyInfoBO
     */
    public void modifyCompanyInfo(ModifyCompanyInfoBO companyInfoBO);

    /**
     * 修改企业相册
     * @param companyInfoBO
     */
    public void savePhotos(ModifyCompanyInfoBO companyInfoBO);

    /**
     * 根据企业id获得相册内容
     * @param companyId
     * @return
     */
    public CompanyPhoto getPhotos(String companyId);
}
