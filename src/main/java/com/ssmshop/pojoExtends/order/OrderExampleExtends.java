package com.ssmshop.pojoExtends.order;

import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.pojo.OrderExample;

import java.math.BigInteger;

public class OrderExampleExtends{
    public static OrderExample getOrderExample(OrderListBo orderListBo){
        OrderExample orderExample = new OrderExample();
       OrderExample.Criteria criteria = orderExample.createCriteria();
       if (!"".equals(orderListBo.getConsignee())){
           criteria.andConsigneeLike("%"+orderListBo.getConsignee()+"%");
       }
       if (orderListBo.getStartTime()>0){
           criteria.andAddTimeGreaterThanOrEqualTo(orderListBo.getStartTime());
       }
       if (orderListBo.getEndTime()>0){
           criteria.andConfirmTimeLessThanOrEqualTo(orderListBo.getEndTime());
       }
       if (!"".equals(orderListBo.getOrderSn())){
           criteria.andOrderSnLike("%"+orderListBo.getOrderSn()+"%");
       }
        if (!"".equals(orderListBo.getPayCode())){
           criteria.andPayCodeLike("%"+orderListBo.getPayCode()+"%");
        }
        if (orderListBo.getPayStatus()>0){
           criteria.andPayStatusEqualTo(orderListBo.getPayStatus());
        }
        if (orderListBo.getShippingStatus()>0){
           criteria.andShippingStatusEqualTo(orderListBo.getShippingStatus());
        }
        return orderExample;
    }
}
