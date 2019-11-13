package com.ssmshop.pojo;

import java.math.BigDecimal;

public class UserLevel {
    private Short levelId;

    private String levelName;

    private BigDecimal amount;

    private Short discount;

    private String describe;

    public UserLevel(Short levelId, String levelName, BigDecimal amount, Short discount, String describe) {
        this.levelId = levelId;
        this.levelName = levelName;
        this.amount = amount;
        this.discount = discount;
        this.describe = describe;
    }

    public UserLevel() {
        super();
    }

    public Short getLevelId() {
        return levelId;
    }

    public void setLevelId(Short levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Short getDiscount() {
        return discount;
    }

    public void setDiscount(Short discount) {
        this.discount = discount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}