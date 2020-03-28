package com.ssmshop.controller.backend.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GroupBuy;
import com.ssmshop.service.promotion.IGroupBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/groupBuy/")
@ResponseBody
public class GroupBuyController {
    @Autowired
    IGroupBuyService iGroupBuyService;
    @RequestMapping("list.do")
    public ServerResponse<PageInfo<GroupBuy>> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
        return this.iGroupBuyService.list(pageNum,pageSize);
    }
    @RequestMapping("detail.do")
    public ServerResponse<GroupBuy> detail(@RequestParam(value = "groupBuyId",defaultValue = "0")int groupBuyId){
        return this.iGroupBuyService.detail(groupBuyId);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ServerResponse<?> add(GroupBuy groupBuy){
        return this.iGroupBuyService.add(groupBuy);

    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "groupBuyId",defaultValue = "0")int groupBuyId,GroupBuy groupBuy){
        return this.iGroupBuyService.edit(groupBuyId,groupBuy);
    }
    @RequestMapping(value = "remove.do")
    public ServerResponse<?> remove(@RequestParam(value = "groupBuyId",defaultValue = "0")int groupBuyId){
        return this.iGroupBuyService.remove(groupBuyId);
    }
}
