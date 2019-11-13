package com.ssmshop.pojo;

public class UserCollection {
    private Integer id;

    private String mobile;

    private String contact;

    private String whyDown;

    private Integer addTime;

    public UserCollection(Integer id, String mobile, String contact, String whyDown, Integer addTime) {
        this.id = id;
        this.mobile = mobile;
        this.contact = contact;
        this.whyDown = whyDown;
        this.addTime = addTime;
    }

    public UserCollection() {
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getWhyDown() {
        return whyDown;
    }

    public void setWhyDown(String whyDown) {
        this.whyDown = whyDown == null ? null : whyDown.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}