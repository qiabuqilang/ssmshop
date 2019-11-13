package com.ssmshop.pojo;

import java.math.BigDecimal;

public class Coupon {
    private Integer id;

    private String name;

    private Boolean type;

    private BigDecimal money;

    private BigDecimal condition;

    private Integer createnum;

    private Integer sendNum;

    private Integer useNum;

    private Integer sendStartTime;

    private Integer sendEndTime;

    private Integer useStartTime;

    private Integer useEndTime;

    private Integer addTime;

    public Coupon(Integer id, String name, Boolean type, BigDecimal money, BigDecimal condition, Integer createnum, Integer sendNum, Integer useNum, Integer sendStartTime, Integer sendEndTime, Integer useStartTime, Integer useEndTime, Integer addTime) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.money = money;
        this.condition = condition;
        this.createnum = createnum;
        this.sendNum = sendNum;
        this.useNum = useNum;
        this.sendStartTime = sendStartTime;
        this.sendEndTime = sendEndTime;
        this.useStartTime = useStartTime;
        this.useEndTime = useEndTime;
        this.addTime = addTime;
    }

    public Coupon() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getCondition() {
        return condition;
    }

    public void setCondition(BigDecimal condition) {
        this.condition = condition;
    }

    public Integer getCreatenum() {
        return createnum;
    }

    public void setCreatenum(Integer createnum) {
        this.createnum = createnum;
    }

    public Integer getSendNum() {
        return sendNum;
    }

    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public Integer getSendStartTime() {
        return sendStartTime;
    }

    public void setSendStartTime(Integer sendStartTime) {
        this.sendStartTime = sendStartTime;
    }

    public Integer getSendEndTime() {
        return sendEndTime;
    }

    public void setSendEndTime(Integer sendEndTime) {
        this.sendEndTime = sendEndTime;
    }

    public Integer getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(Integer useStartTime) {
        this.useStartTime = useStartTime;
    }

    public Integer getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(Integer useEndTime) {
        this.useEndTime = useEndTime;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}