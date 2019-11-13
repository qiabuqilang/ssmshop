package com.ssmshop.pojo;

import java.math.BigDecimal;

public class Users {
    private Integer userId;

    private String email;

    private String password;

    private String paypwd;

    private Boolean sex;

    private Integer birthday;

    private BigDecimal userMoney;

    private BigDecimal frozenMoney;

    private BigDecimal distributMoney;

    private Integer payPoints;

    private Integer addressId;

    private Integer regTime;

    private Integer lastLogin;

    private String lastIp;

    private String qq;

    private String mobile;

    private Byte mobileValidated;

    private String oauth;

    private String openid;

    private String unionid;

    private String headPic;

    private Integer province;

    private Integer city;

    private Integer district;

    private Boolean emailValidated;

    private String nickname;

    private Boolean level;

    private BigDecimal discount;

    private BigDecimal totalAmount;

    private Boolean isLock;

    private Boolean isDistribut;

    private Integer firstLeader;

    private Integer secondLeader;

    private Integer thirdLeader;

    private String token;

    public Users(Integer userId, String email, String password, String paypwd, Boolean sex, Integer birthday, BigDecimal userMoney, BigDecimal frozenMoney, BigDecimal distributMoney, Integer payPoints, Integer addressId, Integer regTime, Integer lastLogin, String lastIp, String qq, String mobile, Byte mobileValidated, String oauth, String openid, String unionid, String headPic, Integer province, Integer city, Integer district, Boolean emailValidated, String nickname, Boolean level, BigDecimal discount, BigDecimal totalAmount, Boolean isLock, Boolean isDistribut, Integer firstLeader, Integer secondLeader, Integer thirdLeader, String token) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.paypwd = paypwd;
        this.sex = sex;
        this.birthday = birthday;
        this.userMoney = userMoney;
        this.frozenMoney = frozenMoney;
        this.distributMoney = distributMoney;
        this.payPoints = payPoints;
        this.addressId = addressId;
        this.regTime = regTime;
        this.lastLogin = lastLogin;
        this.lastIp = lastIp;
        this.qq = qq;
        this.mobile = mobile;
        this.mobileValidated = mobileValidated;
        this.oauth = oauth;
        this.openid = openid;
        this.unionid = unionid;
        this.headPic = headPic;
        this.province = province;
        this.city = city;
        this.district = district;
        this.emailValidated = emailValidated;
        this.nickname = nickname;
        this.level = level;
        this.discount = discount;
        this.totalAmount = totalAmount;
        this.isLock = isLock;
        this.isDistribut = isDistribut;
        this.firstLeader = firstLeader;
        this.secondLeader = secondLeader;
        this.thirdLeader = thirdLeader;
        this.token = token;
    }

    public Users() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPaypwd() {
        return paypwd;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd == null ? null : paypwd.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public BigDecimal getDistributMoney() {
        return distributMoney;
    }

    public void setDistributMoney(BigDecimal distributMoney) {
        this.distributMoney = distributMoney;
    }

    public Integer getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(Integer payPoints) {
        this.payPoints = payPoints;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getMobileValidated() {
        return mobileValidated;
    }

    public void setMobileValidated(Byte mobileValidated) {
        this.mobileValidated = mobileValidated;
    }

    public String getOauth() {
        return oauth;
    }

    public void setOauth(String oauth) {
        this.oauth = oauth == null ? null : oauth.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Boolean getEmailValidated() {
        return emailValidated;
    }

    public void setEmailValidated(Boolean emailValidated) {
        this.emailValidated = emailValidated;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Boolean getIsDistribut() {
        return isDistribut;
    }

    public void setIsDistribut(Boolean isDistribut) {
        this.isDistribut = isDistribut;
    }

    public Integer getFirstLeader() {
        return firstLeader;
    }

    public void setFirstLeader(Integer firstLeader) {
        this.firstLeader = firstLeader;
    }

    public Integer getSecondLeader() {
        return secondLeader;
    }

    public void setSecondLeader(Integer secondLeader) {
        this.secondLeader = secondLeader;
    }

    public Integer getThirdLeader() {
        return thirdLeader;
    }

    public void setThirdLeader(Integer thirdLeader) {
        this.thirdLeader = thirdLeader;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}