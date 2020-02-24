package com.ssmshop.controller.backend;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsType;
import com.ssmshop.service.IGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/manage/goodsType/")
public class GoodsTypeManageController{
    @Autowired
    private IGoodsTypeService iGoodsTypeService;
    @RequestMapping(value = "list.do")
    @ResponseBody
    public ServerResponse<PageInfo<GoodsType>> list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        return this.iGoodsTypeService.list(pageNum,pageSize);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> add(GoodsType goodsType){
        return this.iGoodsTypeService.add(goodsType);
    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<?> edit(GoodsType goodsType,int goodsTypeId){
       return this.iGoodsTypeService.edit(goodsTypeId,goodsType);
    }
    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> remove(@RequestParam(value = "goodsTypeId") int goodsTypeId){
        return this.iGoodsTypeService.remove(goodsTypeId);
    }
    @RequestMapping(value = "detail.do")
    @ResponseBody
    public ServerResponse<GoodsType> detail(@RequestParam(value = "goodsTypeId") int goodsTypeId){
        return this.iGoodsTypeService.detail(goodsTypeId);
    }

}
