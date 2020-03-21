package com.ssmshop.service.impl.order;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsMapper;
import com.ssmshop.dao.OrderActionMapper;
import com.ssmshop.dao.OrderGoodsMapper;
import com.ssmshop.dao.OrderMapper;
import com.ssmshop.pojo.*;
import com.ssmshop.pojoExtends.order.OrderExampleExtends;
import com.ssmshop.service.impl.BaseServiceImpl;
import com.ssmshop.service.order.IOrderService;
import com.ssmshop.utils.DateTimeUtils;
import com.ssmshop.utils.Dump;
import com.ssmshop.utils.ToVoUtils;
import com.ssmshop.vo.order.OrderDetailVo;
import com.ssmshop.vo.order.OrderListVo;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service("iOrderService")
public class OrderServiceImpl extends BaseServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;
    @Autowired
    private OrderActionMapper orderActionMapper;
    @Autowired
    private GoodsMapper goodsMapper;
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
    public ServerResponse<?> edit(int orderId, Order order,String orderGoodsIds) {
        if (orderId >0){
            order.setOrderId(orderId);
            if (!"".equals(orderGoodsIds)){
                String[] orderGoodsIdArr = orderGoodsIds.split("_");
                OrderGoodsExample orderGoodsExample = new OrderGoodsExample();
                orderGoodsExample.createCriteria().andOrderIdEqualTo(orderId);
                this.orderGoodsMapper.deleteByExample(orderGoodsExample);
                for (int i= 0;i<orderGoodsIdArr.length;++i){
                    Goods goods = this.goodsMapper.selectByPrimaryKey(Integer.parseInt(orderGoodsIdArr[i]));
                    OrderGoods orderGoods = new OrderGoods();
                    orderGoods.setOrderId(orderId);
                    BeanUtils.copyProperties(goods,orderGoods);
                    this.orderGoodsMapper.insertSelective(orderGoods);
                }
            }
            return super.responseBase(this.orderMapper.updateByPrimaryKeySelective(order));
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<?> add(Order order,String orderGoodsIds) {
        order.setOrderSn(DateTimeUtils.dateToNum(System.currentTimeMillis()));
        this.orderMapper.insertSelective(order);
       int orderId = order.getOrderId();
        String[] orderGoodsIdArr = orderGoodsIds.split("_");
        for (int i = 0;i<orderGoodsIdArr.length;++i){
            OrderGoods orderGoods = new OrderGoods();
            orderGoods.setOrderId(orderId);
            Goods goods = this.goodsMapper.selectByPrimaryKey(Integer.parseInt(orderGoodsIdArr[i]));
            BeanUtils.copyProperties(goods,orderGoods);
            this.orderGoodsMapper.insertSelective(orderGoods);
        }

        if (orderId>0){
            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> detail(int orderId) {
        Order order = this.orderMapper.selectByPrimaryKey(orderId);
        if (order != null){
            OrderDetailVo orderDetailVo = new OrderDetailVo(order);
            OrderGoodsExample orderGoodsExample = new OrderGoodsExample();
            orderGoodsExample.createCriteria().andOrderIdEqualTo(orderId);
            List<OrderGoods> orderGoodsList = this.orderGoodsMapper.selectByExample(orderGoodsExample);
            orderDetailVo.setGoodsInfoList(orderGoodsList);
            OrderActionExample orderActionExample = new OrderActionExample();
            orderActionExample.createCriteria().andOrderIdEqualTo(orderId);
            List<OrderAction> orderActionList = this.orderActionMapper.selectByExample(orderActionExample);
            orderDetailVo.setOrderActionList(orderActionList);
            return ServerResponse.createBySuccess(orderDetailVo);
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<?> remove(int orderId) {
        if (orderId > 0){
            return super.responseBase(this.orderMapper.deleteByPrimaryKey(orderId));
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<String> editOrderAction(OrderAction orderAction) {

        return super.responseBase(this.orderActionMapper.updateByPrimaryKeySelective(orderAction));
    }
}
