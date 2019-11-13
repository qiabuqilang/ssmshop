package com.ssmshop.pojo;

public class WxKeyword {
    private Integer id;

    private String keyword;

    private Integer pid;

    private String token;

    private String type;

    public WxKeyword(Integer id, String keyword, Integer pid, String token, String type) {
        this.id = id;
        this.keyword = keyword;
        this.pid = pid;
        this.token = token;
        this.type = type;
    }

    public WxKeyword() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}