package com.ssmshop.pojo;

public class PaymentWithBLOBs extends Payment {
    private String payDesc;

    private String payConfig;

    public PaymentWithBLOBs(Byte payId, String payCode, String payName, String payFee, Byte payOrder, Byte enabled, Byte isCod, Byte isOnline, String payDesc, String payConfig) {
        super(payId, payCode, payName, payFee, payOrder, enabled, isCod, isOnline);
        this.payDesc = payDesc;
        this.payConfig = payConfig;
    }

    public PaymentWithBLOBs() {
        super();
    }

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc == null ? null : payDesc.trim();
    }

    public String getPayConfig() {
        return payConfig;
    }

    public void setPayConfig(String payConfig) {
        this.payConfig = payConfig == null ? null : payConfig.trim();
    }
}