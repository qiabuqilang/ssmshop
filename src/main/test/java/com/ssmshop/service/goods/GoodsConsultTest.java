package com.ssmshop.service.goods;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.GoodsConsult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodsConsultTest extends BaseTest{
    public GoodsConsultTest(){
        super(GoodsConsultTest.class);
    }
    @Autowired
    private IGoodsConsultService iGoodsConsultService;
    @Test
    public void listTest(){
        int pageNum = 1;
        int pageSize = 10;
        String username = "清风";
        String content = "测试";
        System.out.println(JSON.toJSON(this.iGoodsConsultService.list(pageNum,pageSize,username,content)));
    }
    @Test
    public void addTest(){
        int goodsId = 110;
        GoodsConsult goodsConsult = new GoodsConsult();
        goodsConsult.setGoodsId(goodsId);
        goodsConsult.setAddTime(System.currentTimeMillis());
        goodsConsult.setUsername("测试用户");
        goodsConsult.setConsultType((byte)1);
        goodsConsult.setContent("测试咨询");
        JSON.toJSON(this.iGoodsConsultService.add(goodsConsult));
    }
    @Test
    public void detailTest(){
        int consultId = 106;
        System.out.println(JSON.toJSON(this.iGoodsConsultService.detail(consultId)));
    }
    @Test
    public void editTest(){
        int consultId = 1;
        GoodsConsult goodsConsult = new GoodsConsult();
        goodsConsult.setContent("修改后测试");
        goodsConsult.setIsShow((byte)0);
        System.out.println(JSON.toJSON(this.iGoodsConsultService.edit(consultId,goodsConsult)));
    }

    @Test
    public void removeTest(){
        int consultId = 1;
        System.out.println(JSON.toJSON(this.iGoodsConsultService.remove(consultId)));
    }
}
