package com.ssmshop.pojo;

public class Payment {
    private Byte payId;

    private String payCode;

    private String payName;

    private String payFee;

    private Byte payOrder;

    private Boolean enabled;

    private Boolean isCod;

    private Boolean isOnline;

    public Payment(Byte payId, String payCode, String payName, String payFee, Byte payOrder, Boolean enabled, Boolean isCod, Boolean isOnline) {
        this.payId = payId;
        this.payCode = payCode;
        this.payName = payName;
        this.payFee = payFee;
        this.payOrder = payOrder;
        this.enabled = enabled;
        this.isCod = isCod;
        this.isOnline = isOnline;
    }

    public Payment() {
        super();
    }

    public Byte getPayId() {
        return payId;
    }

    public void setPayId(Byte payId) {
        this.payId = payId;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getPayFee() {
        return payFee;
    }

    public void setPayFee(String payFee) {
        this.payFee = payFee == null ? null : payFee.trim();
    }

    public Byte getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(Byte payOrder) {
        this.payOrder = payOrder;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getIsCod() {
        return isCod;
    }

    public void setIsCod(Boolean isCod) {
        this.isCod = isCod;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }
}