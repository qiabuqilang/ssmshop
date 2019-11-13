package com.ssmshop.pojo;

public class CouponList {
    private Integer id;

    private Integer cid;

    private Boolean type;

    private Integer uid;

    private Integer orderId;

    private Integer useTime;

    private String code;

    private Integer sendTime;

    public CouponList(Integer id, Integer cid, Boolean type, Integer uid, Integer orderId, Integer useTime, String code, Integer sendTime) {
        this.id = id;
        this.cid = cid;
        this.type = type;
        this.uid = uid;
        this.orderId = orderId;
        this.useTime = useTime;
        this.code = code;
        this.sendTime = sendTime;
    }

    public CouponList() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }
}