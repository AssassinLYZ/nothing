package com.imooc.mapper;

import com.imooc.pojo.Interview;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 面试邀约表
本表为次表，可做冗余，可以用mongo或者es替代 Mapper 接口
 * </p>
 *
 * @author 风间影月
 * @since 2026-05-25
 */
public interface InterviewMapper extends BaseMapper<Interview> {

}
