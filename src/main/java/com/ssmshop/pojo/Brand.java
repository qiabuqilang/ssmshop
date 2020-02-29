package com.ssmshop.pojo;

public class Brand {
    private Short id;

    private String name;

    private String logo;

    private String url;

    private Byte sort;

    private String catName;

    private Integer parentCatId;

    private Integer catId;

    private Byte isHot;

    private String brandDesc;

    public Brand(Short id, String name, String logo, String url, Byte sort, String catName, Integer parentCatId, Integer catId, Byte isHot, String brandDesc) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.url = url;
        this.sort = sort;
        this.catName = catName;
        this.parentCatId = parentCatId;
        this.catId = catId;
        this.isHot = isHot;
        this.brandDesc = brandDesc;
    }

    public Brand() {
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public Integer getParentCatId() {
        return parentCatId;
    }

    public void setParentCatId(Integer parentCatId) {
        this.parentCatId = parentCatId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }
}