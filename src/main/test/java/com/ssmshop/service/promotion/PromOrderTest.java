package com.ssmshop.service.promotion;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.PromOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PromOrderTest extends BaseTest {
    @Autowired
    private IPromOrderService iPromOrderService;
    private  int pageSize = 10;
    private  int pageNum = 1;
    public PromOrderTest() {
        super(PromOrderTest.class);
    }
    @Test
    public void listTest(){
        System.out.println(JSON.toJSON(this.iPromOrderService.list(pageNum,pageSize)));
    }
    @Test
    public void detailTest(){
        Long promOrderId = new Long(1);
        System.out.println(JSON.toJSON(this.iPromOrderService.detail(promOrderId)));
    }
    @Test
    public void addTest(){
        PromOrder promOrder = new PromOrder();
        promOrder.setDescription("添加测试");
        promOrder.setExpression("50");
        promOrder.setGroupIds("1_2_3");
        promOrder.setMoney(new Float(115));
        promOrder.setStartTime(new Integer(System.currentTimeMillis()/1000+""));
        promOrder.setEndTime(1258478596);
        promOrder.setName("添加订单");
        promOrder.setType(1);
        System.out.println(JSON.toJSON(this.iPromOrderService.add(promOrder)));
    }
    @Test
    public void editTest(){
        Long promOrderId = new Long(2);
        PromOrder promOrder = new PromOrder();
        promOrder.setDescription("添加测试修改");
        promOrder.setExpression("50");
        promOrder.setGroupIds("1_2_3");
        promOrder.setMoney(new Float(115));
        promOrder.setStartTime(new Integer(System.currentTimeMillis()/1000+""));
        promOrder.setEndTime(1258478596);
        promOrder.setName("添加订单修改");
        promOrder.setType(0);
        System.out.println(JSON.toJSON(this.iPromOrderService.edit(promOrderId,promOrder)));

    }
    @Test
    public void removeTest(){
        Long promOrderId = new Long(2);
        System.out.println(JSON.toJSON(this.iPromOrderService.remove(promOrderId)));
    }
}
