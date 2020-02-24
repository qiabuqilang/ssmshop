package com.ssmshop.service;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.GoodsAttr;
import com.ssmshop.pojo.GoodsAttribute;
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
        int goodsTypeId = 36;
        System.out.println(JSON.toJSON(this.iGoodsTypeService.edit(goodsTypeId,goodsType)));
    }

    @Test
    public void removeTest(){
        int goodsTypeId = 34;
        System.out.println(JSON.toJSON(this.iGoodsTypeService.remove(goodsTypeId)));
    }

    @Test
    public void goodsSpecListTest(){
        int goodsTypeId = 35;
        System.out.println(JSON.toJSON(this.iGoodsSpecService.list(1,10)));
        System.out.println(JSON.toJSON(this.iGoodsSpecService.list(1,10,goodsTypeId)));
    }

    @Test
    public void goodsSpecAddTest(){
        int goodsTypeId = 35;
        Spec spec = new Spec();
        spec.setTypeId(goodsTypeId);
        spec.setName("test");
        System.out.println(JSON.toJSON(this.iGoodsSpecService.add(spec)));
    }
    @Test
    public void goodsSpecEditTest(){
        int goodsSpecId = 29;
        Spec spec = new Spec();
        spec.setId(goodsSpecId);
        spec.setName("test修改后");
        System.out.println(JSON.toJSON(this.iGoodsSpecService.edit(goodsSpecId,spec)));
    }
    @Test
    public void goodsSpecRemove(){
        int goodsSpecId = 28;
        System.out.println(JSON.toJSON(this.iGoodsSpecService.remove(goodsSpecId)));
    }
    @Test
    public void goodsAttributeAddTest(){
        int goodsTypeId = 35;
        GoodsAttribute goodsAttribute = new GoodsAttribute();
        goodsAttribute.setTypeId((short) goodsTypeId);
        goodsAttribute.setAttrName("测试属性名称");
        goodsAttribute.setAttrValues("测试属性值");
        System.out.println(JSON.toJSON(this.iGoodsAttributeService.add(goodsAttribute)));
    }
    @Test
    public void goodsAttributeListTest(){
        int goodsTypeId = 35;
        int pageNum = 1;
        int pageSize = 10;
        System.out.println(JSON.toJSON(this.iGoodsAttributeService.list(pageNum,pageSize)));
        System.out.println(JSON.toJSON(this.iGoodsAttributeService.list(pageNum,pageSize,goodsTypeId)));
    }
    @Test
    public void goodsAttributeEditTest(){
        int goodsAttributeId = 331;
        GoodsAttribute goodsAttribute = new GoodsAttribute();
        goodsAttribute.setAttrName("test修改后");
        System.out.println(JSON.toJSON(this.iGoodsAttributeService.edit(goodsAttribute,goodsAttributeId)));
    }
    @Test
    public void goodsAttributeRemoveTest(){
        int goodsAttributeId = 330;
        System.out.println(JSON.toJSON(this.iGoodsAttributeService.remove(goodsAttributeId)));
    }



}
