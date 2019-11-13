package com.ssmshop.pojo;

public class Suppliers {
    private Short suppliersId;

    private String suppliersName;

    private Boolean isCheck;

    private String suppliersContacts;

    private String suppliersPhone;

    private String suppliersDesc;

    public Suppliers(Short suppliersId, String suppliersName, Boolean isCheck, String suppliersContacts, String suppliersPhone, String suppliersDesc) {
        this.suppliersId = suppliersId;
        this.suppliersName = suppliersName;
        this.isCheck = isCheck;
        this.suppliersContacts = suppliersContacts;
        this.suppliersPhone = suppliersPhone;
        this.suppliersDesc = suppliersDesc;
    }

    public Suppliers() {
        super();
    }

    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName == null ? null : suppliersName.trim();
    }

    public Boolean getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Boolean isCheck) {
        this.isCheck = isCheck;
    }

    public String getSuppliersContacts() {
        return suppliersContacts;
    }

    public void setSuppliersContacts(String suppliersContacts) {
        this.suppliersContacts = suppliersContacts == null ? null : suppliersContacts.trim();
    }

    public String getSuppliersPhone() {
        return suppliersPhone;
    }

    public void setSuppliersPhone(String suppliersPhone) {
        this.suppliersPhone = suppliersPhone == null ? null : suppliersPhone.trim();
    }

    public String getSuppliersDesc() {
        return suppliersDesc;
    }

    public void setSuppliersDesc(String suppliersDesc) {
        this.suppliersDesc = suppliersDesc == null ? null : suppliersDesc.trim();
    }
}