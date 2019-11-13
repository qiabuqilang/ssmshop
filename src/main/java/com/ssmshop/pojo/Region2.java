package com.ssmshop.pojo;

public class Region2 {
    private Integer id;

    private String name;

    private Integer parentId;

    private Boolean level;

    public Region2(Integer id, String name, Integer parentId, Boolean level) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
    }

    public Region2() {
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }
}