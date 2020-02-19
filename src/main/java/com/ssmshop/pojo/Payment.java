package com.ssmshop.pojo;

public class Payment {
    private Byte payId;

    private String payCode;

    private String payName;

    private String payFee;

    private Byte payOrder;

    private Byte enabled;

    private Byte isCod;

    private Byte isOnline;

    public Payment(Byte payId, String payCode, String payName, String payFee, Byte payOrder, Byte enabled, Byte isCod, Byte isOnline) {
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

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Byte getIsCod() {
        return isCod;
    }

    public void setIsCod(Byte isCod) {
        this.isCod = isCod;
    }

    public Byte getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Byte isOnline) {
        this.isOnline = isOnline;
    }
}