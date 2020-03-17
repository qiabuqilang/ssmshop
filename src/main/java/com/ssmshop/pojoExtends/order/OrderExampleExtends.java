package com.ssmshop.pojoExtends.order;

import com.ssmshop.bo.order.OrderListBo;
import com.ssmshop.pojo.OrderExample;
import org.apache.commons.lang3.ObjectUtils;

import java.math.BigInteger;

public class OrderExampleExtends{
    public static OrderExample getOrderExample(OrderListBo orderListBo){
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();

            if (orderListBo.getConsignee()!=null && !"".equals(orderListBo.getConsignee())){
                criteria.andConsigneeLike("%"+orderListBo.getConsignee()+"%");
            }
            if (orderListBo.getStartTime()!=null && orderListBo.getStartTime()>0){
                criteria.andAddTimeGreaterThanOrEqualTo(orderListBo.getStartTime());
            }
            if (orderListBo.getEndTime()!=null && orderListBo.getEndTime()>0){
                criteria.andConfirmTimeLessThanOrEqualTo(orderListBo.getEndTime());
            }
            if (orderListBo.getOrderSn()!=null && !"".equals(orderListBo.getOrderSn())){
                criteria.andOrderSnLike("%"+orderListBo.getOrderSn()+"%");
            }
            if (orderListBo.getPayCode()!=null && !"".equals(orderListBo.getPayCode())){
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
