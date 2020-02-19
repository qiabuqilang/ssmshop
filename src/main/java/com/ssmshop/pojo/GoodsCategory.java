package com.ssmshop.pojo;

public class GoodsCategory {
    private Short id;

    private String name;

    private String mobileName;

    private Short parentId;

    private String parentIdPath;

    private Byte level;

    private Byte sortOrder;

    private Byte isShow;

    private String image;

    private Byte isHot;

    private Byte catGroup;

    private Byte commissionRate;

    public GoodsCategory(Short id, String name, String mobileName, Short parentId, String parentIdPath, Byte level, Byte sortOrder, Byte isShow, String image, Byte isHot, Byte catGroup, Byte commissionRate) {
        this.id = id;
        this.name = name;
        this.mobileName = mobileName;
        this.parentId = parentId;
        this.parentIdPath = parentIdPath;
        this.level = level;
        this.sortOrder = sortOrder;
        this.isShow = isShow;
        this.image = image;
        this.isHot = isHot;
        this.catGroup = catGroup;
        this.commissionRate = commissionRate;
    }

    public GoodsCategory() {
        super();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName == null ? null : mobileName.trim();
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public String getParentIdPath() {
        return parentIdPath;
    }

    public void setParentIdPath(String parentIdPath) {
        this.parentIdPath = parentIdPath == null ? null : parentIdPath.trim();
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Byte getCatGroup() {
        return catGroup;
    }

    public void setCatGroup(Byte catGroup) {
        this.catGroup = catGroup;
    }

    public Byte getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Byte commissionRate) {
        this.commissionRate = commissionRate;
    }
}