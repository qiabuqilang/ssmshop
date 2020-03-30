package com.ssmshop.controller.backend.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.PromGoods;
import com.ssmshop.service.promotion.IPromoSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import java.util.List;

@Controller
@RequestMapping("/manage/promoSale/")
@ResponseBody
public class PromoSaleController {
    @Autowired
    private IPromoSaleService iPromoSaleService;
    @RequestMapping("list.do")
    public ServerResponse<PageInfo<PromGoods>> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
        return this.iPromoSaleService.list(pageNum,pageSize);
    }
    @RequestMapping("detail.do")
    public ServerResponse<?> detail(@RequestParam(value = "promoGoodsId",defaultValue = "0")Long promoGoodsId){
        return this.iPromoSaleService.detail(promoGoodsId);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ServerResponse<?> add(PromGoods promGoods){
        return this.iPromoSaleService.add(promGoods);
    }

    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "promoGoodsId",defaultValue = "0") Long promoGoodsId,PromGoods promGoods){
        return this.iPromoSaleService.edit(promoGoodsId,promGoods);
    }

    @RequestMapping(value = "remove.do")
    public ServerResponse<?> remove(@RequestParam(value = "promoGoodsId",defaultValue = "0")Long promoGoodId){
        return this.iPromoSaleService.remove(promoGoodId);
    }

}
