package com.ssmshop.pojo;

public class PromGoods {
    private Long id;

    private String name;

    private Integer type;

    private String expression;

    private Integer startTime;

    private Integer endTime;

    private Byte isClose;

    private String groupIds;

    private String promImg;

    private String goodsIds;

    private String description;

    public PromGoods(Long id, String name, Integer type, String expression, Integer startTime, Integer endTime, Byte isClose, String groupIds, String promImg, String goodsIds, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.expression = expression;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isClose = isClose;
        this.groupIds = groupIds;
        this.promImg = promImg;
        this.goodsIds = goodsIds;
        this.description = description;
    }

    public PromGoods() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
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

    public Byte getIsClose() {
        return isClose;
    }

    public void setIsClose(Byte isClose) {
        this.isClose = isClose;
    }

    public String getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds == null ? null : groupIds.trim();
    }

    public String getPromImg() {
        return promImg;
    }

    public void setPromImg(String promImg) {
        this.promImg = promImg == null ? null : promImg.trim();
    }

    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds == null ? null : goodsIds.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}