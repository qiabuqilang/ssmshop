package com.ssmshop.pojo;

public class GoodsAttribute {
    private Integer attrId;

    private String attrName;

    private Short typeId;

    private Byte attrIndex;

    private Byte attrType;

    private Byte attrInputType;

    private Integer attrOrder;

    private String attrValues;

    public GoodsAttribute(Integer attrId, String attrName, Short typeId, Byte attrIndex, Byte attrType, Byte attrInputType, Integer attrOrder) {
        this.attrId = attrId;
        this.attrName = attrName;
        this.typeId = typeId;
        this.attrIndex = attrIndex;
        this.attrType = attrType;
        this.attrInputType = attrInputType;
        this.attrOrder = attrOrder;
    }

    public GoodsAttribute(Integer attrId, String attrName, Short typeId, Byte attrIndex, Byte attrType, Byte attrInputType, Integer attrOrder, String attrValues) {
        this.attrId = attrId;
        this.attrName = attrName;
        this.typeId = typeId;
        this.attrIndex = attrIndex;
        this.attrType = attrType;
        this.attrInputType = attrInputType;
        this.attrOrder = attrOrder;
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

    public Byte getAttrIndex() {
        return attrIndex;
    }

    public void setAttrIndex(Byte attrIndex) {
        this.attrIndex = attrIndex;
    }

    public Byte getAttrType() {
        return attrType;
    }

    public void setAttrType(Byte attrType) {
        this.attrType = attrType;
    }

    public Byte getAttrInputType() {
        return attrInputType;
    }

    public void setAttrInputType(Byte attrInputType) {
        this.attrInputType = attrInputType;
    }

    public Integer getAttrOrder() {
        return attrOrder;
    }

    public void setAttrOrder(Integer attrOrder) {
        this.attrOrder = attrOrder;
    }

    public String getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(String attrValues) {
        this.attrValues = attrValues == null ? null : attrValues.trim();
    }
}