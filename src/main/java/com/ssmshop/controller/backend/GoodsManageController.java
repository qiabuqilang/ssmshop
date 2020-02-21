package com.ssmshop.controller.backend;

import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Goods;
import com.ssmshop.service.IGoodsService;
import com.ssmshop.utils.Dump;
import com.ssmshop.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/manage/goods")
public class GoodsManageController{
    @Autowired
    private IGoodsService iGoodsService;

    @RequestMapping(value = "list.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize, @RequestParam(value = "keywords",defaultValue = "")String keywords, GoodsVo goodsVo){
        System.out.println("------"+pageNum+"------"+pageSize+"-------"+keywords+"-------"+StringUtils.isEmpty(goodsVo));
        Dump.printObjectFields(goodsVo);
        if (!("".equals(keywords)) && StringUtils.isEmpty(goodsVo)){
            System.out.println("11111111");
            return this.iGoodsService.list(pageNum,pageSize,keywords);
        }
        if(!StringUtils.isEmpty(goodsVo) && ("".equals(keywords))){
            System.out.println("22222222");
            return this.iGoodsService.list(pageNum,pageSize,goodsVo);
        }
        if (!StringUtils.isEmpty(goodsVo) && !("".equals(keywords))){
            System.out.println("333333333");
            return this.iGoodsService.list(pageNum,pageSize,keywords,goodsVo);
        }
        return this.iGoodsService.list(pageNum,pageSize);
    }

    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> add(Goods goods){
        return this.iGoodsService.add(goods);
    }

    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<Goods> edit(int goodsId,Goods goods){
        return this.iGoodsService.edit(goodsId,goods);
    }

    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> remove(int goodsId){
        return this.iGoodsService.remove(goodsId);
    }

    @RequestMapping(value = "detail.do")
    @ResponseBody
    public ServerResponse<Goods> detail(@RequestParam(value = "goodsId",required = true) int goodsId){
        return this.iGoodsService.detail(goodsId);
    }

}
