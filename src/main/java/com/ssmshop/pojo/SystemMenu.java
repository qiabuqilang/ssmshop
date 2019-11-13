package com.ssmshop.pojo;

public class SystemMenu {
    private Short id;

    private String name;

    private String group;

    private Boolean isDel;

    private String right;

    public SystemMenu(Short id, String name, String group, Boolean isDel, String right) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.isDel = isDel;
        this.right = right;
    }

    public SystemMenu() {
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right == null ? null : right.trim();
    }
}