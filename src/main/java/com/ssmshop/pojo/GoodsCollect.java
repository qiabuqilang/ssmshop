package com.ssmshop.pojo;

public class GoodsCollect {
    private Integer collectId;

    private Integer userId;

    private Integer goodsId;

    private Integer addTime;

    public GoodsCollect(Integer collectId, Integer userId, Integer goodsId, Integer addTime) {
        this.collectId = collectId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.addTime = addTime;
    }

    public GoodsCollect() {
        super();
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}