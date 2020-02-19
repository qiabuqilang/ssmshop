package com.ssmshop.pojo;

import java.math.BigDecimal;

public class Withdrawals {
    private Integer id;

    private Integer userId;

    private Integer createTime;

    private BigDecimal money;

    private String bankName;

    private String accountBank;

    private String accountName;

    private String remark;

    private Byte status;

    public Withdrawals(Integer id, Integer userId, Integer createTime, BigDecimal money, String bankName, String accountBank, String accountName, String remark, Byte status) {
        this.id = id;
        this.userId = userId;
        this.createTime = createTime;
        this.money = money;
        this.bankName = bankName;
        this.accountBank = accountBank;
        this.accountName = accountName;
        this.remark = remark;
        this.status = status;
    }

    public Withdrawals() {
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

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}