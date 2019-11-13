package com.ssmshop.pojo;

public class OrderAction {
    private Integer actionId;

    private Integer orderId;

    private Integer actionUser;

    private Boolean orderStatus;

    private Boolean shippingStatus;

    private Boolean payStatus;

    private String actionNote;

    private Integer logTime;

    private String statusDesc;

    public OrderAction(Integer actionId, Integer orderId, Integer actionUser, Boolean orderStatus, Boolean shippingStatus, Boolean payStatus, String actionNote, Integer logTime, String statusDesc) {
        this.actionId = actionId;
        this.orderId = orderId;
        this.actionUser = actionUser;
        this.orderStatus = orderStatus;
        this.shippingStatus = shippingStatus;
        this.payStatus = payStatus;
        this.actionNote = actionNote;
        this.logTime = logTime;
        this.statusDesc = statusDesc;
    }

    public OrderAction() {
        super();
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getActionUser() {
        return actionUser;
    }

    public void setActionUser(Integer actionUser) {
        this.actionUser = actionUser;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public String getActionNote() {
        return actionNote;
    }

    public void setActionNote(String actionNote) {
        this.actionNote = actionNote == null ? null : actionNote.trim();
    }

    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc == null ? null : statusDesc.trim();
    }
}