package com.imooc.service.impl;

import com.imooc.pojo.Company;
import com.imooc.mapper.CompanyMapper;
import com.imooc.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业表 服务实现类
 * </p>
 *
 * @author 风间影月
 * @since 2026-05-25
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

}
