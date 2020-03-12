package com.ssmshop.service.impl.order;

import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.OrderMapper;
import com.ssmshop.pojo.Order;
import com.ssmshop.service.order.IOrderService;
import com.ssmshop.vo.order.OrderListVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public ServerResponse<PageInfo<OrderListVo>> list(int pageNum, int pageSize, OrderListBo orderListBo) {


        return null;
    }

    @Override
    public ServerResponse<?> edit(int orderId, Order order) {
        return null;
    }

    @Override
    public ServerResponse<?> add(Order order) {
        return null;
    }

    @Override
    public ServerResponse<?> detail(int orderId) {
        return null;
    }

    @Override
    public ServerResponse<?> remove(int orderId) {
        return null;
    }
}
