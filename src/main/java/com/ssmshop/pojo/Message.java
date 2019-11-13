package com.ssmshop.pojo;

public class Message {
    private Integer messageId;

    private Short adminId;

    private Boolean type;

    private Boolean category;

    private Integer sendTime;

    private String message;

    public Message(Integer messageId, Short adminId, Boolean type, Boolean category, Integer sendTime, String message) {
        this.messageId = messageId;
        this.adminId = adminId;
        this.type = type;
        this.category = category;
        this.sendTime = sendTime;
        this.message = message;
    }

    public Message() {
        super();
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Short getAdminId() {
        return adminId;
    }

    public void setAdminId(Short adminId) {
        this.adminId = adminId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getCategory() {
        return category;
    }

    public void setCategory(Boolean category) {
        this.category = category;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}