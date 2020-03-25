package com.ssmshop.service.order;

import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Order;
import com.ssmshop.pojo.OrderAction;
import com.ssmshop.pojo.OrderGoods;
import com.ssmshop.pojo.ReturnGoods;
import com.ssmshop.service.IBaseService;
import com.ssmshop.vo.order.OrderListVo;

import java.math.BigInteger;
import java.util.List;

public interface IOrderService extends IBaseService{
    ServerResponse<PageInfo<OrderListVo>> list(int pageNum, int pageSize, OrderListBo orderListBo);
    ServerResponse<?> edit(int orderId, Order order,String orderGoodsIds);
    ServerResponse<?> add(Order order,String orderGoodsIds);
    ServerResponse<?> detail(int orderId);
    ServerResponse<?> remove(int orderId);
    ServerResponse<String> editOrderAction(OrderAction orderAction);
    ServerResponse<PageInfo<OrderListVo>> deliveryList(int pageNum,int pageSize,OrderListBo orderListBo);
    ServerResponse<PageInfo<ReturnGoods>> returnList(int pageNum, int pageSize, Byte status);
    ServerResponse<ReturnGoods> returnDetail(int returnId);
    ServerResponse<?> returnEdit(int returnId,byte type,byte status);
    ServerResponse<PageInfo<OrderAction>> orderActionList(int pageNum,int pageSize);
}
