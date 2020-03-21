package com.ssmshop.service.order;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.pojo.Order;
import com.ssmshop.pojo.OrderGoods;
import com.ssmshop.utils.DateTimeUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderTest extends BaseTest {
    @Autowired
    private IOrderService iOrderService;

    public OrderTest() {
        super(OrderTest.class);
    }

    @Test
    public void listTest(){
        int pageNum = 1;
        int pageSize = 10;
        OrderListBo orderListBo = new OrderListBo();
        orderListBo.setConsignee("刘先生");
        orderListBo.setPayStatus((byte)1);
        orderListBo.setStartTime( DateTimeUtils.dateToTimestamp("2015-03-03 00:00:00",1));
        System.out.println(JSON.toJSON(this.iOrderService.list(pageNum,pageSize,orderListBo)));
    }

    @Test
    public void detailTest(){
        int orderId = 210;
        System.out.println(JSON.toJSON(this.iOrderService.detail(orderId)));
    }

    @Test
    public void addTest(){


        Order order = new Order();
        order.setAddress("测试第十");
        order.setAddTime((int)(System.currentTimeMillis()/1000));
        order.setCity(39);
        order.setProvince(3);
        order.setDistrict(416);
        order.setConsignee("ceshi");
        order.setMobile("13171188909");
        order.setGoodsPrice(new BigDecimal(1111));
        String orderGoodsIds = "1_39";
        System.out.println(JSON.toJSON(this.iOrderService.add(order,orderGoodsIds)));
    }
    @Test
    public void editTest(){
        int orderId = 1523;
        Order order = new Order();
        order.setAddress("测试第十修改");
        order.setAddTime((int)(System.currentTimeMillis()/1000));
        order.setCity(39);
        order.setProvince(3);
        order.setDistrict(416);
        order.setConsignee("ceshi");
        order.setMobile("13171188909");
        order.setGoodsPrice(new BigDecimal(1111));
        order.setOrderId(orderId);
        String orderGoodsIds = "41_42_43";
        System.out.println(JSON.toJSON(this.iOrderService.edit(orderId,order,orderGoodsIds)));
    }

    @Test
    public void removeTest(){
        int orderId = 1519;
        System.out.println(JSON.toJSON(this.iOrderService.remove(orderId)));
    }
}
