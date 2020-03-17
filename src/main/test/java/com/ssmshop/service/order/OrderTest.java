package com.ssmshop.service.order;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.utils.DateTimeUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
}
