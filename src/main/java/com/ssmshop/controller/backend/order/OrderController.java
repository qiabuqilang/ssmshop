package com.ssmshop.controller.backend.order;

import com.github.pagehelper.PageInfo;
import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.Order;
import com.ssmshop.pojo.OrderAction;
import com.ssmshop.pojo.ReturnGoods;
import com.ssmshop.service.goods.IGoodsService;
import com.ssmshop.service.order.IOrderService;
import com.ssmshop.vo.order.OrderDetailVo;
import com.ssmshop.vo.order.OrderListVo;
import net.sf.jsqlparser.schema.Server;
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
    @RequestMapping("deliveryList.do")
    public ServerResponse<PageInfo<OrderListVo>> deliveryList(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize, OrderListBo orderListBo){
        return this.iOrderService.deliveryList(pageNum,pageSize,orderListBo);
    }

    @RequestMapping("returnList.do")
    public ServerResponse<PageInfo<ReturnGoods>> returnList(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize, @RequestParam(value = "status",defaultValue = "0")byte status){
        return this.iOrderService.returnList(pageNum,pageSize,status);
    }

    @RequestMapping("returnEdit.do")

    public ServerResponse<?> returnEdit(@RequestParam(value = "returnId",defaultValue = "0")int returnId,@RequestParam(value = "type",defaultValue = "1") byte type,@RequestParam(value = "status",defaultValue = "1")byte status){
        return this.iOrderService.returnEdit(returnId,type,status);
    }

    @RequestMapping("returnDetail.do")
    public ServerResponse<ReturnGoods> returnDetail(@RequestParam(value = "returnId",defaultValue = "0")int returnId){
        return this.iOrderService.returnDetail(returnId);
    }

    @RequestMapping("orderActionList.do")
    public ServerResponse<PageInfo<OrderAction>> orderActionList(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum, @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        return this.iOrderService.orderActionList(pageNum,pageSize);
    }

}
