package com.ssmshop.service;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ssmshop.BaseTest;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsCategoryMapper;
import com.ssmshop.dao.GoodsMapper;
import com.ssmshop.pojo.GoodsCategory;
import com.ssmshop.service.impl.GoodsCategoryServiceImpl;
import com.ssmshop.utils.Dump;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


public class GoodsServiceTest extends BaseTest{
    @Autowired
    private IGoodsCategory iGoodsCategory;
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;
    @Test
    public void listTest(){

        System.out.println( JSON.toJSON(this.iGoodsCategory.list()));
    }

    @Test
    public void addTest(){
        GoodsCategory goodsCategory = new GoodsCategory();
        Byte t = 1;
        goodsCategory.setIsHot(t);
        goodsCategory.setIsShow(t);
        goodsCategory.setName("test00");
        goodsCategory.setMobileName("test00");
        goodsCategory.setLevel((byte) 1);
        goodsCategory.setParentId((short) 94);
        goodsCategory.setCommissionRate((byte) 2);
        goodsCategory.setSortOrder((byte) 1);
        jsonPrint(this.iGoodsCategory.add(goodsCategory));
    }

    @Test
    public void removeTest(){
        int id = 880;
        jsonPrint(this.iGoodsCategory.remove(id));
    }

    @Test
    public void editTest(){
        GoodsCategory goodsCategory = this.goodsCategoryMapper.selectByPrimaryKey((short) 881);
        Dump.printObjectFields(goodsCategory);
        goodsCategory.setMobileName("test00修改00");
        goodsCategory.setName("test00修改00");
        goodsCategory.setParentId((short) 49);
        jsonPrint(this.iGoodsCategory.edit(goodsCategory));
    }
}
