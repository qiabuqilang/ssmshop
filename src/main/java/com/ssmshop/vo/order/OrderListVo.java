package com.ssmshop.vo.order;

import java.math.BigDecimal;

public class OrderListVo {
    /*
    *
订单编号
收货人
总金额
应付金额
订单状态
支付状态
发货状态
支付方式
配送方式
下单时间
    * */
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

    private String invoiceTitle;

    private BigDecimal goodsPrice;

    private BigDecimal shippingPrice;

    private BigDecimal totalAmount;

    private Integer addTime;

    private Integer payTime;

    public OrderListVo(){}

    public OrderListVo(Integer orderId, String orderSn, Integer userId, Byte orderStatus, Byte shippingStatus, Byte payStatus, String consignee, String mobile, String shippingCode, String shippingName, String payCode, String payName, String invoiceTitle, BigDecimal goodsPrice, BigDecimal shippingPrice, BigDecimal totalAmount, Integer addTime, Integer payTime) {
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.userId = userId;
        this.orderStatus = orderStatus;
        this.shippingStatus = shippingStatus;
        this.payStatus = payStatus;
        this.consignee = consignee;
        this.mobile = mobile;
        this.shippingCode = shippingCode;
        this.shippingName = shippingName;
        this.payCode = payCode;
        this.payName = payName;
        this.invoiceTitle = invoiceTitle;
        this.goodsPrice = goodsPrice;
        this.shippingPrice = shippingPrice;
        this.totalAmount = totalAmount;
        this.addTime = addTime;
        this.payTime = payTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Byte getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Byte shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(BigDecimal shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }
}
