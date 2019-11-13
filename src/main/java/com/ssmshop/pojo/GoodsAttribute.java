package com.ssmshop.pojo;

public class GoodsAttribute {
    private Integer attrId;

    private String attrName;

    private Short typeId;

    private Boolean attrIndex;

    private Boolean attrType;

    private Boolean attrInputType;

    private Byte order;

    private String attrValues;

    public GoodsAttribute(Integer attrId, String attrName, Short typeId, Boolean attrIndex, Boolean attrType, Boolean attrInputType, Byte order, String attrValues) {
        this.attrId = attrId;
        this.attrName = attrName;
        this.typeId = typeId;
        this.attrIndex = attrIndex;
        this.attrType = attrType;
        this.attrInputType = attrInputType;
        this.order = order;
        this.attrValues = attrValues;
    }

    public GoodsAttribute() {
        super();
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public Short getTypeId() {
        return typeId;
    }

    public void setTypeId(Short typeId) {
        this.typeId = typeId;
    }

    public Boolean getAttrIndex() {
        return attrIndex;
    }

    public void setAttrIndex(Boolean attrIndex) {
        this.attrIndex = attrIndex;
    }

    public Boolean getAttrType() {
        return attrType;
    }

    public void setAttrType(Boolean attrType) {
        this.attrType = attrType;
    }

    public Boolean getAttrInputType() {
        return attrInputType;
    }

    public void setAttrInputType(Boolean attrInputType) {
        this.attrInputType = attrInputType;
    }

    public Byte getOrder() {
        return order;
    }

    public void setOrder(Byte order) {
        this.order = order;
    }

    public String getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(String attrValues) {
        this.attrValues = attrValues == null ? null : attrValues.trim();
    }
}