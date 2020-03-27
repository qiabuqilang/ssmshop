package com.ssmshop.pojo;

public class FlashSale {
    private Long id;

    private String title;

    private Integer goodsId;

    private Float price;

    private Integer goodsNum;

    private Integer buyLimit;

    private Integer buyNum;

    private Integer orderNum;

    private Integer startTime;

    private Integer endTime;

    private Byte isEnd;

    private String goodsName;

    private String description;

    public FlashSale(Long id, String title, Integer goodsId, Float price, Integer goodsNum, Integer buyLimit, Integer buyNum, Integer orderNum, Integer startTime, Integer endTime, Byte isEnd, String goodsName) {
        this.id = id;
        this.title = title;
        this.goodsId = goodsId;
        this.price = price;
        this.goodsNum = goodsNum;
        this.buyLimit = buyLimit;
        this.buyNum = buyNum;
        this.orderNum = orderNum;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isEnd = isEnd;
        this.goodsName = goodsName;
    }

    public FlashSale(Long id, String title, Integer goodsId, Float price, Integer goodsNum, Integer buyLimit, Integer buyNum, Integer orderNum, Integer startTime, Integer endTime, Byte isEnd, String goodsName, String description) {
        this.id = id;
        this.title = title;
        this.goodsId = goodsId;
        this.price = price;
        this.goodsNum = goodsNum;
        this.buyLimit = buyLimit;
        this.buyNum = buyNum;
        this.orderNum = orderNum;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isEnd = isEnd;
        this.goodsName = goodsName;
        this.description = description;
    }

    public FlashSale() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(Integer buyLimit) {
        this.buyLimit = buyLimit;
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

    public Byte getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Byte isEnd) {
        this.isEnd = isEnd;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}