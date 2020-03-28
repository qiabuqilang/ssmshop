package com.ssmshop.pojo;

import java.math.BigDecimal;

public class GroupBuy {
    private Integer id;

    private String title;

    private Integer startTime;

    private Integer endTime;

    private Integer goodsId;

    private BigDecimal price;

    private Integer goodsNum;

    private Integer buyNum;

    private Integer orderNum;

    private Integer virtualNum;

    private BigDecimal rebate;

    private BigDecimal goodsPrice;

    private String goodsName;

    private Byte recommended;

    private Integer views;

    private String intro;

    public GroupBuy(Integer id, String title, Integer startTime, Integer endTime, Integer goodsId, BigDecimal price, Integer goodsNum, Integer buyNum, Integer orderNum, Integer virtualNum, BigDecimal rebate, BigDecimal goodsPrice, String goodsName, Byte recommended, Integer views) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.goodsId = goodsId;
        this.price = price;
        this.goodsNum = goodsNum;
        this.buyNum = buyNum;
        this.orderNum = orderNum;
        this.virtualNum = virtualNum;
        this.rebate = rebate;
        this.goodsPrice = goodsPrice;
        this.goodsName = goodsName;
        this.recommended = recommended;
        this.views = views;

    }

    public GroupBuy(Integer id, String title, Integer startTime, Integer endTime, Integer goodsId, BigDecimal price, Integer goodsNum, Integer buyNum, Integer orderNum, Integer virtualNum, BigDecimal rebate, BigDecimal goodsPrice, String goodsName, Byte recommended, Integer views, String intro) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.goodsId = goodsId;
        this.price = price;
        this.goodsNum = goodsNum;
        this.buyNum = buyNum;
        this.orderNum = orderNum;
        this.virtualNum = virtualNum;
        this.rebate = rebate;
        this.goodsPrice = goodsPrice;
        this.goodsName = goodsName;
        this.recommended = recommended;
        this.views = views;
        this.intro = intro;
    }

    public GroupBuy() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getVirtualNum() {
        return virtualNum;
    }

    public void setVirtualNum(Integer virtualNum) {
        this.virtualNum = virtualNum;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Byte getRecommended() {
        return recommended;
    }

    public void setRecommended(Byte recommended) {
        this.recommended = recommended;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }
}