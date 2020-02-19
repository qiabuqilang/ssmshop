package com.ssmshop.pojo;

public class VirtualShop {
    private Integer userId;

    private String shopName;

    private Byte shopLevel;

    private String shopLogo;

    private String shopPhone;

    private String shopQq;

    private Byte shopTheme;

    private String shopIntro;

    public VirtualShop(Integer userId, String shopName, Byte shopLevel, String shopLogo, String shopPhone, String shopQq, Byte shopTheme, String shopIntro) {
        this.userId = userId;
        this.shopName = shopName;
        this.shopLevel = shopLevel;
        this.shopLogo = shopLogo;
        this.shopPhone = shopPhone;
        this.shopQq = shopQq;
        this.shopTheme = shopTheme;
        this.shopIntro = shopIntro;
    }

    public VirtualShop() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Byte getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(Byte shopLevel) {
        this.shopLevel = shopLevel;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo == null ? null : shopLogo.trim();
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone == null ? null : shopPhone.trim();
    }

    public String getShopQq() {
        return shopQq;
    }

    public void setShopQq(String shopQq) {
        this.shopQq = shopQq == null ? null : shopQq.trim();
    }

    public Byte getShopTheme() {
        return shopTheme;
    }

    public void setShopTheme(Byte shopTheme) {
        this.shopTheme = shopTheme;
    }

    public String getShopIntro() {
        return shopIntro;
    }

    public void setShopIntro(String shopIntro) {
        this.shopIntro = shopIntro == null ? null : shopIntro.trim();
    }
}