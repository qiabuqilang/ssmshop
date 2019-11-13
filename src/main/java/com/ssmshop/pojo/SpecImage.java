package com.ssmshop.pojo;

public class SpecImage {
    private Integer goodsId;

    private Integer specImageId;

    private String src;

    public SpecImage(Integer goodsId, Integer specImageId, String src) {
        this.goodsId = goodsId;
        this.specImageId = specImageId;
        this.src = src;
    }

    public SpecImage() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSpecImageId() {
        return specImageId;
    }

    public void setSpecImageId(Integer specImageId) {
        this.specImageId = specImageId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }
}