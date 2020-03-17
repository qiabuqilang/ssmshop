package com.ssmshop.service.impl.order;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.OrderMapper;
import com.ssmshop.pojo.Order;
import com.ssmshop.pojo.OrderExample;
import com.ssmshop.pojoExtends.order.OrderExampleExtends;
import com.ssmshop.service.order.IOrderService;
import com.ssmshop.utils.Dump;
import com.ssmshop.utils.ToVoUtils;
import com.ssmshop.vo.order.OrderListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
@Service("iOrderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public ServerResponse<PageInfo<OrderListVo>> list(int pageNum, int pageSize, OrderListBo orderListBo) {
        OrderExample orderExample = OrderExampleExtends.getOrderExample(orderListBo);
        PageHelper.startPage(pageNum,pageSize);
        List<Order> orderList = this.orderMapper.selectByExample(orderExample);
        List<OrderListVo> orderListVos = new ArrayList<>();
        ToVoUtils toVoUtils = new ToVoUtils<OrderListVo,Order>(OrderListVo.class,Order.class);
        orderListVos = toVoUtils.toVos(orderListVos,orderList);
        PageInfo<OrderListVo> pageInfo = new PageInfo<>(orderListVos);
        return ServerResponse.createBySuccess(pageInfo);
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
