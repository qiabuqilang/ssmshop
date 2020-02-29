package com.ssmshop.service;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.dao.GoodsMapper;
import com.ssmshop.pojo.Goods;
import com.ssmshop.vo.GoodsVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class GoodsServiceTest extends BaseTest {
    @Autowired
    private IGoodsService iGoodsService;
    GoodsServiceTest(){
        super(GoodsServiceTest.class);
    }
    @Test
    public void goodsListTest(){
        int pageNum = 1;
        int pageSize =10;
        String keywords ="洗衣机";
        GoodsVo goodsVo = new GoodsVo();
        goodsVo.setBrandId((short)11);
        goodsVo.setCatId(12);
        goodsVo.setIsHot((byte)1);
        goodsVo.setIsNew((byte)1);
        goodsVo.setIsOnSale((byte) 1);
        System.out.println(JSON.toJSON(this.iGoodsService.list(pageNum,pageSize))+"\n-------------");
        System.out.println(JSON.toJSON(this.iGoodsService.list(pageNum,pageSize,keywords))+"\n-------------");
        System.out.println(JSON.toJSON(this.iGoodsService.list(pageNum,pageSize,keywords,goodsVo))+"\n-------------");

    }

    @Test
    public void addTest(){
        Goods goods = new Goods();
        goods.setBrandId((short)11);
        goods.setCatId(191);
        goods.setGoodsName("test00");
        goods.setMarketPrice(BigDecimal.valueOf(3300));
        goods.setSalesSum(110);
        goods.setClickCount(100);
        goods.setShopPrice(BigDecimal.valueOf(3000));
        goods.setGoodsContent("test0000000000000");
        goods.setCommission(BigDecimal.valueOf(100));
        goods.setCommentCount((short)8);
        System.out.println(JSON.toJSON(this.iGoodsService.add(goods)));

    }
    @Test
    public void editTest(){
        Goods goods = new Goods();
        int goodsId = 144;
        goods.setGoodsName("test00修改");
        System.out.println(JSON.toJSON(this.iGoodsService.edit(goodsId,goods)));
    }

    @Test
    public void removeTest(){
        int goodsId = 144;
        System.out.println(JSON.toJSON(this.iGoodsService.remove(goodsId)));
    }

    @Test
    public void detailTest(){
        int goodsId = 143;
        System.out.println(JSON.toJSON(this.iGoodsService.detail(goodsId)));
    }
}
