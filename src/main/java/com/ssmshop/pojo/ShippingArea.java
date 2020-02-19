package com.ssmshop.pojo;

public class ShippingArea {
    private Short shippingAreaId;

    private String shippingAreaName;

    private String shippingCode;

    private Integer updateTime;

    private Byte isDefault;

    private String config;

    public ShippingArea(Short shippingAreaId, String shippingAreaName, String shippingCode, Integer updateTime, Byte isDefault, String config) {
        this.shippingAreaId = shippingAreaId;
        this.shippingAreaName = shippingAreaName;
        this.shippingCode = shippingCode;
        this.updateTime = updateTime;
        this.isDefault = isDefault;
        this.config = config;
    }

    public ShippingArea() {
        super();
    }

    public Short getShippingAreaId() {
        return shippingAreaId;
    }

    public void setShippingAreaId(Short shippingAreaId) {
        this.shippingAreaId = shippingAreaId;
    }

    public String getShippingAreaName() {
        return shippingAreaName;
    }

    public void setShippingAreaName(String shippingAreaName) {
        this.shippingAreaName = shippingAreaName == null ? null : shippingAreaName.trim();
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}