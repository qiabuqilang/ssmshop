package com.ssmshop.pojo;

import java.math.BigDecimal;

public class SpecGoodsPrice {
    private Integer goodsId;

    private String key;

    private String keyName;

    private BigDecimal price;

    private Integer storeCount;

    private String barCode;

    private String sku;

    public SpecGoodsPrice(Integer goodsId, String key, String keyName, BigDecimal price, Integer storeCount, String barCode, String sku) {
        this.goodsId = goodsId;
        this.key = key;
        this.keyName = keyName;
        this.price = price;
        this.storeCount = storeCount;
        this.barCode = barCode;
        this.sku = sku;
    }

    public SpecGoodsPrice() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStoreCount() {
        return storeCount;
    }

    public void setStoreCount(Integer storeCount) {
        this.storeCount = storeCount;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}