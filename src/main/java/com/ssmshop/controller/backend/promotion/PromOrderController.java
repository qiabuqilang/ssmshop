package com.ssmshop.controller.backend.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.PromOrder;
import com.ssmshop.service.promotion.IPromOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/promOrder/")
@ResponseBody
public class PromOrderController {
    @Autowired
    private IPromOrderService iPromOrderService;
    @RequestMapping(value = "list.do")
    public ServerResponse<PageInfo<PromOrder>> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
        return this.iPromOrderService.list(pageNum,pageSize);
    }
    @RequestMapping(value = "detail.do")
    public ServerResponse<?> detail(@RequestParam(value = "promOrderId",defaultValue = "0")Long promOrderId){
        return this.iPromOrderService.detail(promOrderId);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ServerResponse<?> add(PromOrder promOrder){
        return  this.iPromOrderService.add(promOrder);
    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "promOrderId",defaultValue = "0")Long promOrderId,PromOrder promOrder){
        return this.iPromOrderService.edit(promOrderId,promOrder);
    }
    @RequestMapping(value = "remove.do")
    public ServerResponse<?> remove(@RequestParam(value = "promOrderId",defaultValue = "0")Long promOrderId){
        return  this.iPromOrderService.remove(promOrderId);
    }

}
