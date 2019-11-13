package com.ssmshop.pojo;

public class SpecItem {
    private Integer id;

    private Integer specId;

    private String item;

    public SpecItem(Integer id, Integer specId, String item) {
        this.id = id;
        this.specId = specId;
        this.item = item;
    }

    public SpecItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }
}