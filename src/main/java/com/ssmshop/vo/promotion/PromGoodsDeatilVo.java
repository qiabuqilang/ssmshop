package com.ssmshop.vo.promotion;

import com.ssmshop.pojo.Goods;

import java.util.List;

public class PromGoodsDeatilVo {
    private Long id;

    private String name;

    private Integer type;

    private String expression;

    private Integer startTime;

    private Integer endTime;

    private Byte isClose;

    private String group;

    private String promImg;

    private String description;

    private String goodsIds;

    private List<Goods> goodsList;

    public PromGoodsDeatilVo() {
    }

    public PromGoodsDeatilVo(Long id, String name, Integer type, String expression, Integer startTime, Integer endTime, Byte isClose, String group, String promImg, String description, String goodsIds, List<Goods> goodsList) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.expression = expression;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isClose = isClose;
        this.group = group;
        this.promImg = promImg;
        this.description = description;
        this.goodsIds = goodsIds;
        this.goodsList = goodsList;
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
        this.name = name;
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
        this.expression = expression;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPromImg() {
        return promImg;
    }

    public void setPromImg(String promImg) {
        this.promImg = promImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
