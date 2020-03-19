package com.ssmshop.service.order;

import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Order;
import com.ssmshop.pojo.OrderGoods;
import com.ssmshop.service.IBaseService;
import com.ssmshop.vo.order.OrderListVo;

import java.math.BigInteger;
import java.util.List;

public interface IOrderService extends IBaseService{
    ServerResponse<PageInfo<OrderListVo>> list(int pageNum, int pageSize, OrderListBo orderListBo);
    ServerResponse<?> edit(int orderId, Order order,List<OrderGoods> orderGoodsList);
    ServerResponse<?> add(Order order, List<OrderGoods> orderGoodsList);
    ServerResponse<?> detail(int orderId);
    ServerResponse<?> remove(int orderId);
}
