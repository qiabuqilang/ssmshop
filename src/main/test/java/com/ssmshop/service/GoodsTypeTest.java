package com.ssmshop.service;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.GoodsType;
import com.ssmshop.pojo.Spec;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodsTypeTest extends BaseTest{
    @Autowired
    private IGoodsTypeService iGoodsTypeService;
    @Autowired
    private IGoodsSpecService iGoodsSpecService;
    @Autowired
    private IGoodsAttributeService iGoodsAttributeService;

    @Test
    public void listTest(){
        System.out.println(JSON.toJSON(this.iGoodsTypeService.list(1,10)));
    }

    @Test
    public void addTest(){
        GoodsType goodsType = new GoodsType();
        goodsType.setName("test00");
        System.out.println(JSON.toJSON(this.iGoodsTypeService.add(goodsType)));
    }

    @Test
    public void edit(){
        GoodsType goodsType = new GoodsType();
        goodsType.setName("test00修改后");
        int goodsTypeId = 34;
        System.out.println(JSON.toJSON(this.iGoodsTypeService.edit(goodsTypeId,goodsType)));
    }

    @Test
    public void removeTest(){
        int goodsTypeId = 34;
        System.out.println(JSON.toJSON(this.iGoodsTypeService.remove(goodsTypeId)));
    }

    @Test
    public void goodsSpecList(){
        int goodsTypeId = 35;
        System.out.println(JSON.toJSON(this.iGoodsSpecService.list(1,10,goodsTypeId)));
    }

    @Test
    public void goodsSpecAdd(){
        int goodsTypeId = 35;
        Spec spec = new Spec();
        spec.setTypeId(goodsTypeId);
        spec.setName("test");
        System.out.println(JSON.toJSON(this.iGoodsSpecService.add(spec,goodsTypeId)));
    }
}
