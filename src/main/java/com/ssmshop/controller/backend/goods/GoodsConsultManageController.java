package com.ssmshop.controller.backend.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsConsult;
import com.ssmshop.service.goods.IGoodsConsultService;
import com.ssmshop.vo.goods.GoodsConsultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/goodsConsult/")
@ResponseBody
public class GoodsConsultManageController {
    @Autowired
    private IGoodsConsultService iGoodsConsultService;
    @RequestMapping(value = "list.do")
    public ServerResponse<PageInfo<GoodsConsultVo>> list(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,@RequestParam(value = "pageSize",defaultValue = "10") int pageSize,@RequestParam(value = "username",defaultValue = "")String username,@RequestParam(value = "content",defaultValue = "")String content){
        return this.iGoodsConsultService.list(pageNum,pageSize,username,content);
    }
    @RequestMapping(value = "detail.do")
    public ServerResponse<?> detail(@RequestParam(value = "consultId",defaultValue = "0")int consultId){
        return this.iGoodsConsultService.detail(consultId);
    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "consultId",defaultValue = "0")int consultId, GoodsConsult goodsConsult){
        GoodsConsult goodsConsultParam = new GoodsConsult();
        goodsConsultParam.setId(consultId);
        goodsConsultParam.setIsShow(goodsConsult.getIsShow());
        return this.iGoodsConsultService.edit(consultId,goodsConsultParam);
    }
    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    public ServerResponse<?> remove(@RequestParam(value = "consultId",defaultValue = "0")int consultId){
        return this.iGoodsConsultService.remove(consultId);
    }
}
