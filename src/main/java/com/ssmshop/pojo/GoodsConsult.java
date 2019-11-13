package com.ssmshop.pojo;

public class GoodsConsult {
    private Integer id;

    private Integer goodsId;

    private String username;

    private Integer addTime;

    private Boolean consultType;

    private String content;

    private Integer parentId;

    private Boolean isShow;

    public GoodsConsult(Integer id, Integer goodsId, String username, Integer addTime, Boolean consultType, String content, Integer parentId, Boolean isShow) {
        this.id = id;
        this.goodsId = goodsId;
        this.username = username;
        this.addTime = addTime;
        this.consultType = consultType;
        this.content = content;
        this.parentId = parentId;
        this.isShow = isShow;
    }

    public GoodsConsult() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Boolean getConsultType() {
        return consultType;
    }

    public void setConsultType(Boolean consultType) {
        this.consultType = consultType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}