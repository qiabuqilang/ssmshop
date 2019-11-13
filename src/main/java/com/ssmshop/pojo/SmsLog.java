package com.ssmshop.pojo;

public class SmsLog {
    private Integer id;

    private String mobile;

    private String sessionId;

    private Integer addTime;

    private String code;

    private Integer status;

    public SmsLog(Integer id, String mobile, String sessionId, Integer addTime, String code, Integer status) {
        this.id = id;
        this.mobile = mobile;
        this.sessionId = sessionId;
        this.addTime = addTime;
        this.code = code;
        this.status = status;
    }

    public SmsLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}