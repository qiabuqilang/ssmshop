package com.ssmshop.pojo;

public class Spec {
    private Integer id;

    private Integer typeId;

    private String name;

    private Integer typeOrder;

    private Byte searchIndex;

    public Spec(Integer id, Integer typeId, String name, Integer typeOrder, Byte searchIndex) {
        this.id = id;
        this.typeId = typeId;
        this.name = name;
        this.typeOrder = typeOrder;
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

    public Integer getTypeOrder() {
        return typeOrder;
    }

    public void setTypeOrder(Integer typeOrder) {
        this.typeOrder = typeOrder;
    }

    public Byte getSearchIndex() {
        return searchIndex;
    }

    public void setSearchIndex(Byte searchIndex) {
        this.searchIndex = searchIndex;
    }
}