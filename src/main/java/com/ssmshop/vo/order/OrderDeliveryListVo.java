package com.ssmshop.vo.order;

import java.math.BigDecimal;

public class OrderDeliveryListVo {
    private Integer orderId;

    private String orderSn;

    private Integer userId;

    private Byte orderStatus;

    private Byte shippingStatus;

    private Byte payStatus;

    private String consignee;

    private String mobile;

    private String shippingCode;

    private String shippingName;

    private String payCode;

    private String payName;

    private BigDecimal goodsPrice;

    private BigDecimal shippingPrice;

    private BigDecimal totalAmount;

    private Integer addTime;

    private Integer payTime;
}
