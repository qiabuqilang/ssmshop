package com.ssmshop.service.goods;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.Brand;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class GoodsBrandTest extends BaseTest{
    @Autowired
    private IGoodsBrandService iGoodsBrandService;

    public GoodsBrandTest(){
        super(GoodsBrandTest.class);
    }
    @Test
    public void listTest(){
        int pageNum = 1;
        int pageSize = 10;
        String keywords = "华为";
        System.out.println(JSON.toJSON(this.iGoodsBrandService.list(pageNum,pageSize)));
        System.out.println(JSON.toJSON(this.iGoodsBrandService.list(pageNum,pageSize,keywords)));
    }
    @Test
    public void detailTest(){
        int goodsBrandId = 1;
        System.out.println(JSON.toJSON(this.iGoodsBrandService.detail(goodsBrandId)));
    }
    @Test
    public void addTest(){
        Brand brand = new Brand();
        brand.setName("test00");
        brand.setBrandDesc("test00描述测试");
        brand.setCatId(12);
        brand.setParentCatId(1);
        System.out.println(JSON.toJSON(this.iGoodsBrandService.add(brand)));
    }

    @Test
    public void editTest(){
        int brandId = 353;
        Brand brand = new Brand();
        brand.setName("test00修改后");
        brand.setBrandDesc("test00描述测试修改后");
        System.out.println(JSON.toJSON(this.iGoodsBrandService.edit(brandId,brand)));
    }

    @Test
    public void removeTest(){
        int brandId = 353;
        System.out.println(JSON.toJSON(this.iGoodsBrandService.remove(brandId)));
    }


}
