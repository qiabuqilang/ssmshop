package com.ssmshop.pojo;

public class WxUser {
    private Integer id;

    private Integer uid;

    private String wxname;

    private String aeskey;

    private Boolean encode;

    private String appid;

    private String appsecret;

    private String wxid;

    private String weixin;

    private String headerpic;

    private String token;

    private String wToken;

    private Integer createTime;

    private Integer updatetime;

    private String tplcontentid;

    private String shareTicket;

    private String shareDated;

    private String authorizerAccessToken;

    private String authorizerRefreshToken;

    private String authorizerExpires;

    private Boolean type;

    private String webAccessToken;

    private String webRefreshToken;

    private Integer webExpires;

    private String qr;

    private Boolean waitAccess;

    private String menuConfig;

    public WxUser(Integer id, Integer uid, String wxname, String aeskey, Boolean encode, String appid, String appsecret, String wxid, String weixin, String headerpic, String token, String wToken, Integer createTime, Integer updatetime, String tplcontentid, String shareTicket, String shareDated, String authorizerAccessToken, String authorizerRefreshToken, String authorizerExpires, Boolean type, String webAccessToken, String webRefreshToken, Integer webExpires, String qr, Boolean waitAccess, String menuConfig) {
        this.id = id;
        this.uid = uid;
        this.wxname = wxname;
        this.aeskey = aeskey;
        this.encode = encode;
        this.appid = appid;
        this.appsecret = appsecret;
        this.wxid = wxid;
        this.weixin = weixin;
        this.headerpic = headerpic;
        this.token = token;
        this.wToken = wToken;
        this.createTime = createTime;
        this.updatetime = updatetime;
        this.tplcontentid = tplcontentid;
        this.shareTicket = shareTicket;
        this.shareDated = shareDated;
        this.authorizerAccessToken = authorizerAccessToken;
        this.authorizerRefreshToken = authorizerRefreshToken;
        this.authorizerExpires = authorizerExpires;
        this.type = type;
        this.webAccessToken = webAccessToken;
        this.webRefreshToken = webRefreshToken;
        this.webExpires = webExpires;
        this.qr = qr;
        this.waitAccess = waitAccess;
        this.menuConfig = menuConfig;
    }

    public WxUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getWxname() {
        return wxname;
    }

    public void setWxname(String wxname) {
        this.wxname = wxname == null ? null : wxname.trim();
    }

    public String getAeskey() {
        return aeskey;
    }

    public void setAeskey(String aeskey) {
        this.aeskey = aeskey == null ? null : aeskey.trim();
    }

    public Boolean getEncode() {
        return encode;
    }

    public void setEncode(Boolean encode) {
        this.encode = encode;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getHeaderpic() {
        return headerpic;
    }

    public void setHeaderpic(String headerpic) {
        this.headerpic = headerpic == null ? null : headerpic.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getwToken() {
        return wToken;
    }

    public void setwToken(String wToken) {
        this.wToken = wToken == null ? null : wToken.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public String getTplcontentid() {
        return tplcontentid;
    }

    public void setTplcontentid(String tplcontentid) {
        this.tplcontentid = tplcontentid == null ? null : tplcontentid.trim();
    }

    public String getShareTicket() {
        return shareTicket;
    }

    public void setShareTicket(String shareTicket) {
        this.shareTicket = shareTicket == null ? null : shareTicket.trim();
    }

    public String getShareDated() {
        return shareDated;
    }

    public void setShareDated(String shareDated) {
        this.shareDated = shareDated == null ? null : shareDated.trim();
    }

    public String getAuthorizerAccessToken() {
        return authorizerAccessToken;
    }

    public void setAuthorizerAccessToken(String authorizerAccessToken) {
        this.authorizerAccessToken = authorizerAccessToken == null ? null : authorizerAccessToken.trim();
    }

    public String getAuthorizerRefreshToken() {
        return authorizerRefreshToken;
    }

    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken == null ? null : authorizerRefreshToken.trim();
    }

    public String getAuthorizerExpires() {
        return authorizerExpires;
    }

    public void setAuthorizerExpires(String authorizerExpires) {
        this.authorizerExpires = authorizerExpires == null ? null : authorizerExpires.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getWebAccessToken() {
        return webAccessToken;
    }

    public void setWebAccessToken(String webAccessToken) {
        this.webAccessToken = webAccessToken == null ? null : webAccessToken.trim();
    }

    public String getWebRefreshToken() {
        return webRefreshToken;
    }

    public void setWebRefreshToken(String webRefreshToken) {
        this.webRefreshToken = webRefreshToken == null ? null : webRefreshToken.trim();
    }

    public Integer getWebExpires() {
        return webExpires;
    }

    public void setWebExpires(Integer webExpires) {
        this.webExpires = webExpires;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr == null ? null : qr.trim();
    }

    public Boolean getWaitAccess() {
        return waitAccess;
    }

    public void setWaitAccess(Boolean waitAccess) {
        this.waitAccess = waitAccess;
    }

    public String getMenuConfig() {
        return menuConfig;
    }

    public void setMenuConfig(String menuConfig) {
        this.menuConfig = menuConfig == null ? null : menuConfig.trim();
    }
}