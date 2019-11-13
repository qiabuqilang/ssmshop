package com.ssmshop.pojo;

public class Config {
    private Short id;

    private String name;

    private String value;

    private String incType;

    private String desc;

    public Config(Short id, String name, String value, String incType, String desc) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.incType = incType;
        this.desc = desc;
    }

    public Config() {
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getIncType() {
        return incType;
    }

    public void setIncType(String incType) {
        this.incType = incType == null ? null : incType.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}