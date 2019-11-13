package com.ssmshop.pojo;

public class FeedBack {
    private Integer msgId;

    private Integer parentId;

    private Integer userId;

    private String userName;

    private String msgTitle;

    private Boolean msgType;

    private Boolean msgStatus;

    private Integer msgTime;

    private String messageImg;

    private Integer orderId;

    private Boolean msgArea;

    private String msgContent;

    public FeedBack(Integer msgId, Integer parentId, Integer userId, String userName, String msgTitle, Boolean msgType, Boolean msgStatus, Integer msgTime, String messageImg, Integer orderId, Boolean msgArea, String msgContent) {
        this.msgId = msgId;
        this.parentId = parentId;
        this.userId = userId;
        this.userName = userName;
        this.msgTitle = msgTitle;
        this.msgType = msgType;
        this.msgStatus = msgStatus;
        this.msgTime = msgTime;
        this.messageImg = messageImg;
        this.orderId = orderId;
        this.msgArea = msgArea;
        this.msgContent = msgContent;
    }

    public FeedBack() {
        super();
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public Boolean getMsgType() {
        return msgType;
    }

    public void setMsgType(Boolean msgType) {
        this.msgType = msgType;
    }

    public Boolean getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(Boolean msgStatus) {
        this.msgStatus = msgStatus;
    }

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public String getMessageImg() {
        return messageImg;
    }

    public void setMessageImg(String messageImg) {
        this.messageImg = messageImg == null ? null : messageImg.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Boolean getMsgArea() {
        return msgArea;
    }

    public void setMsgArea(Boolean msgArea) {
        this.msgArea = msgArea;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }
}