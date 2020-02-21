package com.ssmshop.pojo;

import java.math.BigDecimal;

public class Goods {
    private Integer goodsId;

    private Integer catId;

    private Integer extendCatId;

    private String goodsSn;

    private String goodsName;

    private Integer clickCount;

    private Short brandId;

    private Short storeCount;

    private Short commentCount;

    private Integer weight;

    private BigDecimal marketPrice;

    private BigDecimal shopPrice;

    private BigDecimal costPrice;

    private String keywords;

    private String goodsRemark;

    private String originalImg;

    private Byte isReal;

    private Byte isOnSale;

    private Byte isFreeShipping;

    private Integer onTime;

    private Short sort;

    private Byte isRecommend;

    private Byte isNew;

    private Byte isHot;

    private Integer lastUpdate;

    private Short goodsType;

    private Short specType;

    private Integer giveIntegral;

    private Integer exchangeIntegral;

    private Short suppliersId;

    private Integer salesSum;

    private Byte promType;

    private Integer promId;

    private BigDecimal commission;

    private String spu;

    private String sku;

    private String shippingAreaIds;

    private String goodsContent;
    public Goods(Integer goodsId, Integer catId, Integer extendCatId, String goodsSn, String goodsName, Short brandId, Short storeCount,BigDecimal shopPrice, Byte isOnSale, Short sort, Byte isRecommend, Byte isNew, Byte isHot) {
        this.goodsId = goodsId;
        this.catId = catId;
        this.extendCatId = extendCatId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;

        this.brandId = brandId;

        this.storeCount = storeCount;

        this.shopPrice = shopPrice;

        this.isOnSale = isOnSale;

        this.sort = sort;
        this.isRecommend = isRecommend;
        this.isNew = isNew;
        this.isHot = isHot;

    }

    public Goods(Integer goodsId, Integer catId, Integer extendCatId, String goodsSn, String goodsName, Integer clickCount, Short brandId, Short storeCount, Short commentCount, Integer weight, BigDecimal marketPrice, BigDecimal shopPrice, BigDecimal costPrice, String keywords, String goodsRemark, String originalImg, Byte isReal, Byte isOnSale, Byte isFreeShipping, Integer onTime, Short sort, Byte isRecommend, Byte isNew, Byte isHot, Integer lastUpdate, Short goodsType, Short specType, Integer giveIntegral, Integer exchangeIntegral, Short suppliersId, Integer salesSum, Byte promType, Integer promId, BigDecimal commission, String spu, String sku, String shippingAreaIds, String goodsContent) {
        this.goodsId = goodsId;
        this.catId = catId;
        this.extendCatId = extendCatId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
        this.clickCount = clickCount;
        this.brandId = brandId;
        this.storeCount = storeCount;
        this.commentCount = commentCount;
        this.weight = weight;
        this.marketPrice = marketPrice;
        this.shopPrice = shopPrice;
        this.costPrice = costPrice;
        this.keywords = keywords;
        this.goodsRemark = goodsRemark;
        this.originalImg = originalImg;
        this.isReal = isReal;
        this.isOnSale = isOnSale;
        this.isFreeShipping = isFreeShipping;
        this.onTime = onTime;
        this.sort = sort;
        this.isRecommend = isRecommend;
        this.isNew = isNew;
        this.isHot = isHot;
        this.lastUpdate = lastUpdate;
        this.goodsType = goodsType;
        this.specType = specType;
        this.giveIntegral = giveIntegral;
        this.exchangeIntegral = exchangeIntegral;
        this.suppliersId = suppliersId;
        this.salesSum = salesSum;
        this.promType = promType;
        this.promId = promId;
        this.commission = commission;
        this.spu = spu;
        this.sku = sku;
        this.shippingAreaIds = shippingAreaIds;
        this.goodsContent = goodsContent;
    }

    public Goods() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
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
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Short getBrandId() {
        return brandId;
    }

    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    public Short getStoreCount() {
        return storeCount;
    }

    public void setStoreCount(Short storeCount) {
        this.storeCount = storeCount;
    }

    public Short getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Short commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark == null ? null : goodsRemark.trim();
    }

    public String getOriginalImg() {
        return originalImg;
    }

    public void setOriginalImg(String originalImg) {
        this.originalImg = originalImg == null ? null : originalImg.trim();
    }

    public Byte getIsReal() {
        return isReal;
    }

    public void setIsReal(Byte isReal) {
        this.isReal = isReal;
    }

    public Byte getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Byte isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Byte getIsFreeShipping() {
        return isFreeShipping;
    }

    public void setIsFreeShipping(Byte isFreeShipping) {
        this.isFreeShipping = isFreeShipping;
    }

    public Integer getOnTime() {
        return onTime;
    }

    public void setOnTime(Integer onTime) {
        this.onTime = onTime;
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

    public Integer getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Short getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Short goodsType) {
        this.goodsType = goodsType;
    }

    public Short getSpecType() {
        return specType;
    }

    public void setSpecType(Short specType) {
        this.specType = specType;
    }

    public Integer getGiveIntegral() {
        return giveIntegral;
    }

    public void setGiveIntegral(Integer giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    public Integer getExchangeIntegral() {
        return exchangeIntegral;
    }

    public void setExchangeIntegral(Integer exchangeIntegral) {
        this.exchangeIntegral = exchangeIntegral;
    }

    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    public Integer getSalesSum() {
        return salesSum;
    }

    public void setSalesSum(Integer salesSum) {
        this.salesSum = salesSum;
    }

    public Byte getPromType() {
        return promType;
    }

    public void setPromType(Byte promType) {
        this.promType = promType;
    }

    public Integer getPromId() {
        return promId;
    }

    public void setPromId(Integer promId) {
        this.promId = promId;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu == null ? null : spu.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getShippingAreaIds() {
        return shippingAreaIds;
    }

    public void setShippingAreaIds(String shippingAreaIds) {
        this.shippingAreaIds = shippingAreaIds == null ? null : shippingAreaIds.trim();
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent == null ? null : goodsContent.trim();
    }
}