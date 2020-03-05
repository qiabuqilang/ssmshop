package com.ssmshop.vo.goods;

import com.ssmshop.pojo.Goods;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

public class GoodsVo {
    private Integer goodsId;

    private Integer catId;

    private Short brandId;

    private Integer extendCatId;

    private String goodsSn;

    private String goodsName;

    private Short storeCount;

    private BigDecimal shopPrice;

    private Byte isOnSale;

    private Short sort;

    private Byte isRecommend;

    private Byte isNew;

    public GoodsVo(){

    }
    public GoodsVo(Integer goodsId, Integer catId, Short brandId, Integer extendCatId, String goodsSn, String goodsName, Short storeCount, BigDecimal shopPrice, Byte isOnSale, Short sort, Byte isRecommend, Byte isNew, Byte isHot) {

        this.goodsId = goodsId;
        this.catId = catId;
        this.brandId = brandId;
        this.extendCatId = extendCatId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
        this.storeCount = storeCount;
        this.shopPrice = shopPrice;
        this.isOnSale = isOnSale;
        this.sort = sort;
        this.isRecommend = isRecommend;
        this.isNew = isNew;
        this.isHot = isHot;
    }

    private Byte isHot;

    public Integer getGoodsId() {
        return goodsId;
    }

    public Short getBrandId() {
        return brandId;
    }

    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getExtendCatId() {
        return extendCatId;
    }

    public void setExtendCatId(Integer extendCatId) {
        this.extendCatId = extendCatId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Short getStoreCount() {
        return storeCount;
    }

    public void setStoreCount(Short storeCount) {
        this.storeCount = storeCount;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public Byte getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Byte isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Byte getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public GoodsVo goodsToVo(Goods goods){
        GoodsVo goodsVo = new GoodsVo();
        BeanUtils.copyProperties(goods,goodsVo);
        return goodsVo;
    }
}
