package com.ssmshop.pojo;

public class AreaRegionKey {
    private Integer shippingAreaId;

    private Integer regionId;

    public AreaRegionKey(Integer shippingAreaId, Integer regionId) {
        this.shippingAreaId = shippingAreaId;
        this.regionId = regionId;
    }

    public AreaRegionKey() {
        super();
    }

    public Integer getShippingAreaId() {
        return shippingAreaId;
    }

    public void setShippingAreaId(Integer shippingAreaId) {
        this.shippingAreaId = shippingAreaId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}