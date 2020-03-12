package com.ssmshop.service.order;

import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Order;
import com.ssmshop.vo.order.OrderListVo;

import java.math.BigInteger;

public interface IOrderService {
    ServerResponse<PageInfo<OrderListVo>> list(int pageNum, int pageSize, OrderListBo orderListBo);
    ServerResponse<?> edit(int orderId, Order order);
    ServerResponse<?> add(Order order);
    ServerResponse<?> detail(int orderId);
    ServerResponse<?> remove(int orderId);
}
