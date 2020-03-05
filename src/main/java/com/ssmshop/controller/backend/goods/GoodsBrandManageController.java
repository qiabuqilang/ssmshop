package com.ssmshop.controller.backend.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Brand;
import com.ssmshop.service.goods.IGoodsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/brand/")
@ResponseBody
public class GoodsBrandManageController {
    @Autowired
    private IGoodsBrandService iGoodsBrandService;
    @RequestMapping(value = "list.do")
    public ServerResponse<PageInfo<Brand>> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize,@RequestParam(value = "keywords",defaultValue = "",required = false)String keywords){
        if ("".equals(keywords)){
            return this.iGoodsBrandService.list(pageNum,pageSize);
        }else{
            return this.iGoodsBrandService.list(pageNum,pageSize,keywords);
        }
    }
    @RequestMapping("detail.do")
    public ServerResponse<Brand> detail(@RequestParam(value = "brandId",defaultValue = "0")int brandId){
        return this.iGoodsBrandService.detail(brandId);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ServerResponse<String> add(Brand brand){
        return this.iGoodsBrandService.add(brand);
    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "brandId",defaultValue = "0")int brandId,Brand brand){
        return this.iGoodsBrandService.edit(brandId,brand);
    }
    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    public ServerResponse<String> remove(@RequestParam(value = "brandId",defaultValue = "0")int brandId){
        return this.iGoodsBrandService.remove(brandId);
    }
}
