package com.ssmshop.controller.backend.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.FlashSale;
import com.ssmshop.service.promotion.IScareBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/scareBuy/")
@ResponseBody
public class ScareBuyController {
    @Autowired
    private IScareBuyService iScareBuyService;
    @RequestMapping("list.do")
    public ServerResponse<PageInfo<FlashSale>> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
        return  this.iScareBuyService.list(pageNum,pageSize);
    }
    @RequestMapping("detail.do")
    public ServerResponse<FlashSale> detail(@RequestParam(value = "flashSaleId",defaultValue = "0")Long flashSaleId){
        return this.iScareBuyService.detail(flashSaleId);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ServerResponse<?> add(FlashSale flashSale){
        return this.iScareBuyService.add(flashSale);
    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "flashSaleId",defaultValue = "0") Long flashSaleId,FlashSale flashSale){
        return this.iScareBuyService.edit(flashSaleId,flashSale);
    }
    @RequestMapping("remove.do")
    public ServerResponse<?> remove(@RequestParam(value = "flashSaleId",defaultValue = "0")Long flashSaleId){
        return this.iScareBuyService.remove(flashSaleId);
    }
}
