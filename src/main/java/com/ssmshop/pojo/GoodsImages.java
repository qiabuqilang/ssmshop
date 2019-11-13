package com.ssmshop.pojo;

public class GoodsImages {
    private Integer imgId;

    private Integer goodsId;

    private String imageUrl;

    public GoodsImages(Integer imgId, Integer goodsId, String imageUrl) {
        this.imgId = imgId;
        this.goodsId = goodsId;
        this.imageUrl = imageUrl;
    }

    public GoodsImages() {
        super();
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}