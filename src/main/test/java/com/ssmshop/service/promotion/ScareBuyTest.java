package com.ssmshop.service.promotion;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.FlashSale;
import com.ssmshop.utils.DateTimeUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ScareBuyTest extends BaseTest{
    public ScareBuyTest() {
        super(ScareBuyTest.class);
    }
    @Autowired
    private IScareBuyService iScareBuyService;
    @Test
    public void listTest(){
        int pageNum = 1;
        int pageSize = 10;
        System.out.println(JSON.toJSON(this.iScareBuyService.list(pageNum,pageSize)));
    }
    @Test
    public void detailTest(){
        Long flashSaleId = new Long(1);
        System.out.println(JSON.toJSON(this.iScareBuyService.detail(flashSaleId)));

    }
    @Test
    public void addTest(){
        FlashSale flashSale = new FlashSale();
        flashSale.setBuyLimit(30);
        flashSale.setBuyNum(30);
        flashSale.setGoodsId(1);
        flashSale.setDescription("测试抢购");
        flashSale.setGoodsNum(300);
        flashSale.setOrderNum(100);
        flashSale.setEndTime(1021548578);
        flashSale.setTitle("测试标题抢购");
        flashSale.setPrice((float)3300.00);
        flashSale.setStartTime((int)System.currentTimeMillis()/1000);
        System.out.println(JSON.toJSON(this.iScareBuyService.add(flashSale)));
    }
    @Test
    public void editTest(){
        Long flashSaleId = new Long(18);
        FlashSale flashSale = new FlashSale();
        flashSale.setBuyLimit(30);
        flashSale.setBuyNum(30);
        flashSale.setGoodsId(1);
        flashSale.setDescription("测试抢购修改");
        flashSale.setGoodsNum(300);
        flashSale.setOrderNum(100);
        flashSale.setEndTime(1021548578);
        flashSale.setTitle("测试标题抢购修改");
        flashSale.setPrice((float)3300.00);
        flashSale.setStartTime((int)System.currentTimeMillis()/1000);
        System.out.println(JSON.toJSON(this.iScareBuyService.edit(flashSaleId,flashSale)));
    }
    @Test
    public void removeTest(){
        Long flashSaleId = new Long(18);
        System.out.println(JSON.toJSON(this.iScareBuyService.remove(flashSaleId)));
    }
}
