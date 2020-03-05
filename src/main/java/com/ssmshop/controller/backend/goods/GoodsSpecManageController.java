package com.ssmshop.controller.backend.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Spec;
import com.ssmshop.service.goods.IGoodsSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/manage/goodsSpec/")
public class GoodsSpecManageController {
    @Autowired
    private IGoodsSpecService iGoodsSpecService;
    @RequestMapping(value = "list.do")
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize,@RequestParam(value = "goodsTypeId",required = false,defaultValue = "0")int goodsTypeId){
        if (goodsTypeId > 0){
            return this.iGoodsSpecService.list(pageNum,pageSize,goodsTypeId);
        }else{
            return this.iGoodsSpecService.list(pageNum,pageSize);
        }
    }

    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> add(Spec spec){
        return this.iGoodsSpecService.add(spec);
    }

    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<?> edit(@RequestParam(value = "goodsSpecId") int goodsSpecId,Spec spec){
        return this.iGoodsSpecService.edit(goodsSpecId,spec);
    }

    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> remove(@RequestParam(value = "goodsSpecId")int goodsSpecId){
        return this.iGoodsSpecService.remove(goodsSpecId);
    }

    @RequestMapping(value = "detail.do")
    @ResponseBody
    public ServerResponse<Spec> detail(@RequestParam(value = "goodsSpecId") int goodsSpecId){
        return this.iGoodsSpecService.detail(goodsSpecId);
    }
}
