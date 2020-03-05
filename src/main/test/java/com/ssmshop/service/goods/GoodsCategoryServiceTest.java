package com.ssmshop.service.goods;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.dao.GoodsCategoryMapper;
import com.ssmshop.pojo.GoodsCategory;
import com.ssmshop.utils.Dump;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class GoodsCategoryServiceTest extends BaseTest{
    @Autowired
    private IGoodsCategoryService iGoodsCategoryService;
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;
    GoodsCategoryServiceTest(){
        super(GoodsCategoryServiceTest.class);
    }
    @Test
    public void listTest(){

        System.out.println( JSON.toJSON(this.iGoodsCategoryService.list()));
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
        jsonPrint(this.iGoodsCategoryService.add(goodsCategory));
    }

    @Test
    public void removeTest(){
        int id = 880;
        jsonPrint(this.iGoodsCategoryService.remove(id));
    }

    @Test
    public void editTest(){
        GoodsCategory goodsCategory = this.goodsCategoryMapper.selectByPrimaryKey((short) 881);
        Dump.printObjectFields(goodsCategory);
        goodsCategory.setMobileName("test00修改00");
        goodsCategory.setName("test00修改00");
        goodsCategory.setParentId((short) 49);
        jsonPrint(this.iGoodsCategoryService.edit(goodsCategory));
    }
}
