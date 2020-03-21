package com.ssmshop.controller.backend.order;

import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.Order;
import com.ssmshop.pojo.OrderAction;
import com.ssmshop.service.goods.IGoodsService;
import com.ssmshop.service.order.IOrderService;
import com.ssmshop.vo.order.OrderDetailVo;
import com.ssmshop.vo.order.OrderListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/manage/order/")
@ResponseBody
public class OrderController {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private IGoodsService iGoodsService;
    @RequestMapping("list.do")
    public ServerResponse<PageInfo<OrderListVo>> list(int pageNum, int pageSize, OrderListBo orderListBo){
        return this.iOrderService.list(pageNum,pageSize,orderListBo);
    }
    @RequestMapping("detail.do")
    public ServerResponse<?> detail(int orderId){
        return this.iOrderService.detail(orderId);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ServerResponse<?> add(Order order,@RequestParam(value = "orderGoodsIds",defaultValue = "") String orderGoodsIds){

        return this.iOrderService.add(order,orderGoodsIds);
    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "orderId",defaultValue = "0") int orderId,Order order,@RequestParam(value = "orderGoodsIds",defaultValue = "") String orderGoodsIds){
        return this.iOrderService.edit(orderId,order,orderGoodsIds);
    }
    @RequestMapping("remove.do")
    public ServerResponse<?> remove(@RequestParam(value = "orderId",defaultValue = "0")int orderId){
        return this.iOrderService.remove(orderId);
    }
    @RequestMapping("editOrderAction.do")
    public ServerResponse<String> editOrderAction(OrderAction orderAction){
        return this.iOrderService.editOrderAction(orderAction);
    }
}
