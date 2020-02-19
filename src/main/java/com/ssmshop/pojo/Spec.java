package com.ssmshop.pojo;

public class Spec {
    private Integer id;

    private Integer typeId;

    private String name;

    private Integer order;

    private Byte searchIndex;

    public Spec(Integer id, Integer typeId, String name, Integer order, Byte searchIndex) {
        this.id = id;
        this.typeId = typeId;
        this.name = name;
        this.order = order;
        this.searchIndex = searchIndex;
    }

    public Spec() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Byte getSearchIndex() {
        return searchIndex;
    }

    public void setSearchIndex(Byte searchIndex) {
        this.searchIndex = searchIndex;
    }
}