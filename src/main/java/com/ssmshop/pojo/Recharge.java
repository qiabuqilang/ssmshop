package com.ssmshop.pojo;

public class Recharge {
    private Long orderId;

    private Long userId;

    private String nickname;

    private String orderSn;

    private Float account;

    private Integer ctime;

    private Integer payTime;

    private String payCode;

    private String payName;

    private Boolean payStatus;

    public Recharge(Long orderId, Long userId, String nickname, String orderSn, Float account, Integer ctime, Integer payTime, String payCode, String payName, Boolean payStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.nickname = nickname;
        this.orderSn = orderSn;
        this.account = account;
        this.ctime = ctime;
        this.payTime = payTime;
        this.payCode = payCode;
        this.payName = payName;
        this.payStatus = payStatus;
    }

    public Recharge() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Float getAccount() {
        return account;
    }

    public void setAccount(Float account) {
        this.account = account;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }
}