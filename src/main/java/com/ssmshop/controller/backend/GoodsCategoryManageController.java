package com.ssmshop.controller.backend;

import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsCategory;
import com.ssmshop.service.IGoodsCategory;
import com.ssmshop.utils.Dump;
import com.ssmshop.vo.GoodsCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/manage/goodsCategory/")
public class GoodsCategoryManageController extends BackendBaseController {
    @Autowired
    private IGoodsCategory iGoodsCategory;

    @RequestMapping(value = "list.do")
    @ResponseBody
    public ServerResponse<List<GoodsCategoryVo>> list(){
        return this.iGoodsCategory.list();
    }

    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> add(GoodsCategory goodsCategory){
        Dump.printObjectFields(goodsCategory);
        return this.iGoodsCategory.add(goodsCategory);
    }

    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> remove(@RequestParam(value = "id",defaultValue = "0") int id){
        if (id>0){
            return this.iGoodsCategory.remove(id);
        }else {
            return ServerResponse.createByError();
        }

    }

    @RequestMapping("edit.do")
    @ResponseBody
    public ServerResponse<String> edit(@RequestParam(value = "id") int id,GoodsCategory goodsCategory){
        goodsCategory.setId((short)id);
        if (id>0){
            return this.iGoodsCategory.edit(goodsCategory);
        }else {
            return ServerResponse.createByError();
        }


    }
}
