package com.ssmshop.service.promotion;

import com.ssmshop.BaseTest;
import com.ssmshop.pojo.GroupBuy;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class GroupBuyTest extends BaseTest {
    @Autowired
    private IGroupBuyService iGroupBuyService;
    private  int pageNum = 1;
    private  int pageSize = 10;
    public GroupBuyTest() {
        super(GroupBuyTest.class);
    }
    @Test
    public void listTest(){
        System.out.println(this.iGroupBuyService.list(pageNum,pageSize));
    }
    @Test
    public void detailTest(){
        int groupBuyId = 2;
        System.out.println(this.iGroupBuyService.detail(groupBuyId));
    }
    @Test
    public void addTest(){
        GroupBuy groupBuy = new GroupBuy();
        groupBuy.setBuyNum(30);
        groupBuy.setEndTime(1524587412);
        groupBuy.setGoodsId(1);
        groupBuy.setTitle("测试团购");
        groupBuy.setGoodsPrice(new BigDecimal(100));
        groupBuy.setIntro("添加测试");
        groupBuy.setRebate(new BigDecimal(10));
        groupBuy.setStartTime((int)System.currentTimeMillis()/1000);
        groupBuy.setGoodsNum(100);
        groupBuy.setPrice(new BigDecimal(100));
        groupBuy.setRecommended((byte) 1);
        System.out.println(this.iGroupBuyService.add(groupBuy));

    }
    @Test
    public void editTest(){
        int groupBuyId = 10;
        GroupBuy groupBuy = new GroupBuy();
        groupBuy.setBuyNum(303);
        groupBuy.setEndTime(1524587412);
        groupBuy.setGoodsId(1);
        groupBuy.setTitle("测试团购修改");
        groupBuy.setGoodsPrice(new BigDecimal(100));
        groupBuy.setIntro("添加测试修改");
        groupBuy.setRebate(new BigDecimal(10));
        groupBuy.setStartTime((int)System.currentTimeMillis()/1000);
        groupBuy.setGoodsNum(1001);
        groupBuy.setPrice(new BigDecimal(101));
        groupBuy.setRecommended((byte) 1);
        System.out.println(this.iGroupBuyService.edit(groupBuyId,groupBuy));
    }

    @Test
    public void removeTest(){
        int groupBuyId = 10;
        System.out.println(this.iGroupBuyService.remove(groupBuyId));
    }
}
