package com.ssmshop.pojo;

public class WxMenu {
    private Integer id;

    private Byte level;

    private String name;

    private Integer sort;

    private String type;

    private String value;

    private String token;

    private Integer pid;

    public WxMenu(Integer id, Byte level, String name, Integer sort, String type, String value, String token, Integer pid) {
        this.id = id;
        this.level = level;
        this.name = name;
        this.sort = sort;
        this.type = type;
        this.value = value;
        this.token = token;
        this.pid = pid;
    }

    public WxMenu() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}