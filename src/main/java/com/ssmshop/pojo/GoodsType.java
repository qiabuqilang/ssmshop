package com.ssmshop.pojo;

public class GoodsType {
    private Short id;

    private String name;

    public GoodsType(Short id, String name) {
        this.id = id;
        this.name = name;
    }

    public GoodsType() {
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
}