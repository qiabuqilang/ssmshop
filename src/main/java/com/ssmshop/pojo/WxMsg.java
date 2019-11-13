package com.ssmshop.pojo;

public class WxMsg {
    private Integer msgid;

    private Integer adminId;

    private String titile;

    private Integer createtime;

    private Integer sendtime;

    private Boolean issend;

    private Boolean sendtype;

    private String content;

    public WxMsg(Integer msgid, Integer adminId, String titile, Integer createtime, Integer sendtime, Boolean issend, Boolean sendtype, String content) {
        this.msgid = msgid;
        this.adminId = adminId;
        this.titile = titile;
        this.createtime = createtime;
        this.sendtime = sendtime;
        this.issend = issend;
        this.sendtype = sendtype;
        this.content = content;
    }

    public WxMsg() {
        super();
    }

    public Integer getMsgid() {
        return msgid;
    }

    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile == null ? null : titile.trim();
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getSendtime() {
        return sendtime;
    }

    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }

    public Boolean getIssend() {
        return issend;
    }

    public void setIssend(Boolean issend) {
        this.issend = issend;
    }

    public Boolean getSendtype() {
        return sendtype;
    }

    public void setSendtype(Boolean sendtype) {
        this.sendtype = sendtype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}