package com.ssmshop.pojo;

public class ReturnGoods {
    private Integer id;

    private Integer orderId;

    private String orderSn;

    private Integer goodsId;

    private Boolean type;

    private String reason;

    private String imgs;

    private Integer addtime;

    private Boolean status;

    private String remark;

    private Integer userId;

    private String specKey;

    public ReturnGoods(Integer id, Integer orderId, String orderSn, Integer goodsId, Boolean type, String reason, String imgs, Integer addtime, Boolean status, String remark, Integer userId, String specKey) {
        this.id = id;
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.goodsId = goodsId;
        this.type = type;
        this.reason = reason;
        this.imgs = imgs;
        this.addtime = addtime;
        this.status = status;
        this.remark = remark;
        this.userId = userId;
        this.specKey = specKey;
    }

    public ReturnGoods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSpecKey() {
        return specKey;
    }

    public void setSpecKey(String specKey) {
        this.specKey = specKey == null ? null : specKey.trim();
    }
}