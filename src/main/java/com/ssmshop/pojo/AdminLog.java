package com.ssmshop.pojo;

public class AdminLog {
    private Long logId;

    private Integer adminId;

    private String logInfo;

    private String logIp;

    private String logUrl;

    private Integer logTime;

    public AdminLog(Long logId, Integer adminId, String logInfo, String logIp, String logUrl, Integer logTime) {
        this.logId = logId;
        this.adminId = adminId;
        this.logInfo = logInfo;
        this.logIp = logIp;
        this.logUrl = logUrl;
        this.logTime = logTime;
    }

    public AdminLog() {
        super();
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp == null ? null : logIp.trim();
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl == null ? null : logUrl.trim();
    }

    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }
}