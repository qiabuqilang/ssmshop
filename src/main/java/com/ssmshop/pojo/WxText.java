package com.ssmshop.pojo;

public class WxText {
    private Integer id;

    private Integer uid;

    private String uname;

    private String keyword;

    private Boolean precisions;

    private String createtime;

    private String updatetime;

    private Integer click;

    private String token;

    private String text;

    public WxText(Integer id, Integer uid, String uname, String keyword, Boolean precisions, String createtime, String updatetime, Integer click, String token, String text) {
        this.id = id;
        this.uid = uid;
        this.uname = uname;
        this.keyword = keyword;
        this.precisions = precisions;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.click = click;
        this.token = token;
        this.text = text;
    }

    public WxText() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Boolean getPrecisions() {
        return precisions;
    }

    public void setPrecisions(Boolean precisions) {
        this.precisions = precisions;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}