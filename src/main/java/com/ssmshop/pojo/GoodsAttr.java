package com.ssmshop.pojo;

public class GoodsAttr {
    private Integer goodsAttrId;

    private Integer goodsId;

    private Short attrId;

    private String attrPrice;

    private String attrValue;

    public GoodsAttr(Integer goodsAttrId, Integer goodsId, Short attrId, String attrPrice, String attrValue) {
        this.goodsAttrId = goodsAttrId;
        this.goodsId = goodsId;
        this.attrId = attrId;
        this.attrPrice = attrPrice;
        this.attrValue = attrValue;
    }

    public GoodsAttr() {
        super();
    }

    public Integer getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(Integer goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getAttrId() {
        return attrId;
    }

    public void setAttrId(Short attrId) {
        this.attrId = attrId;
    }

    public String getAttrPrice() {
        return attrPrice;
    }

    public void setAttrPrice(String attrPrice) {
        this.attrPrice = attrPrice == null ? null : attrPrice.trim();
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }
}