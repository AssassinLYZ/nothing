package com.imooc.service.impl;

import com.imooc.pojo.Interview;
import com.imooc.mapper.InterviewMapper;
import com.imooc.service.InterviewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 面试邀约表
本表为次表，可做冗余，可以用mongo或者es替代 服务实现类
 * </p>
 *
 * @author 风间影月
 * @since 2026-05-25
 */
@Service
public class InterviewServiceImpl extends ServiceImpl<InterviewMapper, Interview> implements InterviewService {

}
