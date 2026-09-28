package com.imooc.service.impl;

import com.imooc.pojo.Article;
import com.imooc.mapper.ArticleMapper;
import com.imooc.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author 风间影月
 * @since 2026-05-25
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
