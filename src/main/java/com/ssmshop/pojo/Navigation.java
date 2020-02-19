package com.ssmshop.pojo;

public class Navigation {
    private Integer id;

    private String name;

    private Byte isShow;

    private Byte isNew;

    private Short sort;

    private String url;

    public Navigation(Integer id, String name, Byte isShow, Byte isNew, Short sort, String url) {
        this.id = id;
        this.name = name;
        this.isShow = isShow;
        this.isNew = isNew;
        this.sort = sort;
        this.url = url;
    }

    public Navigation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}