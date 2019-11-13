package com.ssmshop.pojo;

public class ArticleCategory {
    private Integer catId;

    private String catName;

    private Short catType;

    private Short parentId;

    private Boolean showInNav;

    private Short sortOrder;

    private String catDesc;

    private String keywords;

    private String catAlias;

    public ArticleCategory(Integer catId, String catName, Short catType, Short parentId, Boolean showInNav, Short sortOrder, String catDesc, String keywords, String catAlias) {
        this.catId = catId;
        this.catName = catName;
        this.catType = catType;
        this.parentId = parentId;
        this.showInNav = showInNav;
        this.sortOrder = sortOrder;
        this.catDesc = catDesc;
        this.keywords = keywords;
        this.catAlias = catAlias;
    }

    public ArticleCategory() {
        super();
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public Short getCatType() {
        return catType;
    }

    public void setCatType(Short catType) {
        this.catType = catType;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public Boolean getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Boolean showInNav) {
        this.showInNav = showInNav;
    }

    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc == null ? null : catDesc.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getCatAlias() {
        return catAlias;
    }

    public void setCatAlias(String catAlias) {
        this.catAlias = catAlias == null ? null : catAlias.trim();
    }
}