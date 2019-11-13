package com.ssmshop.pojo;

import java.math.BigDecimal;

public class Remittance {
    private Integer id;

    private Integer userId;

    private String bankName;

    private String accountBank;

    private String accountName;

    private BigDecimal money;

    private Boolean status;

    private Integer createTime;

    private String remark;

    private Integer adminId;

    private Integer withdrawalsId;

    public Remittance(Integer id, Integer userId, String bankName, String accountBank, String accountName, BigDecimal money, Boolean status, Integer createTime, String remark, Integer adminId, Integer withdrawalsId) {
        this.id = id;
        this.userId = userId;
        this.bankName = bankName;
        this.accountBank = accountBank;
        this.accountName = accountName;
        this.money = money;
        this.status = status;
        this.createTime = createTime;
        this.remark = remark;
        this.adminId = adminId;
        this.withdrawalsId = withdrawalsId;
    }

    public Remittance() {
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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getWithdrawalsId() {
        return withdrawalsId;
    }

    public void setWithdrawalsId(Integer withdrawalsId) {
        this.withdrawalsId = withdrawalsId;
    }
}