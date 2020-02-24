package com.ssmshop.controller.backend;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsAttribute;
import com.ssmshop.service.IGoodsAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/manage/goodsAttribute/")
public class GoodsAttributeManageController {
    @Autowired
    private IGoodsAttributeService iGoodsAttributeService;
    @RequestMapping(value = "list.do")
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize,@RequestParam(value = "goodsTypeId",required = false,defaultValue = "0")int goodsTypeId){
        if (goodsTypeId>0){
            return this.iGoodsAttributeService.list(pageNum,pageSize,goodsTypeId);
        }else{
            return this.iGoodsAttributeService.list(pageNum,pageSize);
        }
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> add(GoodsAttribute goodsAttribute){
        return this.iGoodsAttributeService.add(goodsAttribute);
    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<?> edit(@RequestParam(value = "goodsAttributeId") int goodsAttributeId,GoodsAttribute goodsAttribute){
        return this.iGoodsAttributeService.edit(goodsAttribute,goodsAttributeId);
    }
    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> remove(@RequestParam(value = "goodsAttributeId") int goodsAttributeId){
        return this.iGoodsAttributeService.remove(goodsAttributeId);
    }
    @RequestMapping(value = "detail.do")
    @ResponseBody
    public ServerResponse<GoodsAttribute> detail(@RequestParam(value = "goodsAttributeId") int goodsAttributeId){
        return this.iGoodsAttributeService.detail(goodsAttributeId);
    }

}
