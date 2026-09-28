package com.imooc.service.impl;

import com.imooc.pojo.CompanyPhoto;
import com.imooc.mapper.CompanyPhotoMapper;
import com.imooc.service.CompanyPhotoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业相册表，本表只存企业上传的图片 服务实现类
 * </p>
 *
 * @author 风间影月
 * @since 2026-05-25
 */
@Service
public class CompanyPhotoServiceImpl extends ServiceImpl<CompanyPhotoMapper, CompanyPhoto> implements CompanyPhotoService {

}
