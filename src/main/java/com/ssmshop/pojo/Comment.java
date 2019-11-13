package com.ssmshop.pojo;

public class Comment {
    private Integer commentId;

    private Integer goodsId;

    private String email;

    private String username;

    private Boolean deliverRank;

    private Integer addTime;

    private String ipAddress;

    private Boolean isShow;

    private Integer parentId;

    private Integer userId;

    private Integer orderId;

    private Boolean goodsRank;

    private Boolean serviceRank;

    public Comment(Integer commentId, Integer goodsId, String email, String username, Boolean deliverRank, Integer addTime, String ipAddress, Boolean isShow, Integer parentId, Integer userId, Integer orderId, Boolean goodsRank, Boolean serviceRank) {
        this.commentId = commentId;
        this.goodsId = goodsId;
        this.email = email;
        this.username = username;
        this.deliverRank = deliverRank;
        this.addTime = addTime;
        this.ipAddress = ipAddress;
        this.isShow = isShow;
        this.parentId = parentId;
        this.userId = userId;
        this.orderId = orderId;
        this.goodsRank = goodsRank;
        this.serviceRank = serviceRank;
    }

    public Comment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Boolean getDeliverRank() {
        return deliverRank;
    }

    public void setDeliverRank(Boolean deliverRank) {
        this.deliverRank = deliverRank;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Boolean getGoodsRank() {
        return goodsRank;
    }

    public void setGoodsRank(Boolean goodsRank) {
        this.goodsRank = goodsRank;
    }

    public Boolean getServiceRank() {
        return serviceRank;
    }

    public void setServiceRank(Boolean serviceRank) {
        this.serviceRank = serviceRank;
    }
}