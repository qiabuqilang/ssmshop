package com.ssmshop.pojo;

import java.math.BigDecimal;

public class RebateLog {
    private Integer id;

    private Integer userId;

    private Integer buyUserId;

    private String nickname;

    private String orderSn;

    private Integer orderId;

    private BigDecimal goodsPrice;

    private BigDecimal money;

    private Boolean level;

    private Integer createTime;

    private Integer confirm;

    private Boolean status;

    private Integer confirmTime;

    private String remark;

    public RebateLog(Integer id, Integer userId, Integer buyUserId, String nickname, String orderSn, Integer orderId, BigDecimal goodsPrice, BigDecimal money, Boolean level, Integer createTime, Integer confirm, Boolean status, Integer confirmTime, String remark) {
        this.id = id;
        this.userId = userId;
        this.buyUserId = buyUserId;
        this.nickname = nickname;
        this.orderSn = orderSn;
        this.orderId = orderId;
        this.goodsPrice = goodsPrice;
        this.money = money;
        this.level = level;
        this.createTime = createTime;
        this.confirm = confirm;
        this.status = status;
        this.confirmTime = confirmTime;
        this.remark = remark;
    }

    public RebateLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBuyUserId() {
        return buyUserId;
    }

    public void setBuyUserId(Integer buyUserId) {
        this.buyUserId = buyUserId;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getConfirm() {
        return confirm;
    }

    public void setConfirm(Integer confirm) {
        this.confirm = confirm;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}