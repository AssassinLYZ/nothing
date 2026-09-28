package com.imooc.service.impl;

import com.imooc.pojo.Orders;
import com.imooc.mapper.OrdersMapper;
import com.imooc.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author 风间影月
 * @since 2026-05-25
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
