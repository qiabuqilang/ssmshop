package com.ssmshop.service.promotion;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.PromGoods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PromSaleTest extends BaseTest {
    @Autowired
    private IPromoSaleService iPromoSaleService;
    private  int pageNum = 1;
    private  int pageSize = 10;
    public PromSaleTest() {
        super(PromSaleTest.class);
    }
    @Test
    public void listTest (){
        System.out.println(JSON.toJSON(this.iPromoSaleService.list(pageNum,pageSize)));
    }
    @Test
    public void detailTest(){
        Long promGoodsId = new Long(1);
        System.out.println(JSON.toJSON(this.iPromoSaleService.detail(promGoodsId)));
    }
    @Test
    public void addTest(){
        PromGoods promGoods = new PromGoods();
        promGoods.setDescription("测试添加");
        promGoods.setEndTime(1258745896);
        promGoods.setStartTime((int)System.currentTimeMillis()/1000);
        promGoods.setExpression("90");
        promGoods.setGroupIds("1_2_3_4_5");
        promGoods.setGoodsIds("40_41_42_43");
        promGoods.setName("测试优惠蹙额小");
        promGoods.setType(1);
        System.out.println(JSON.toJSON(this.iPromoSaleService.add(promGoods)));

    }

}
