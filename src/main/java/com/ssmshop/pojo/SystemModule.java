package com.ssmshop.pojo;

public class SystemModule {
    private Short modId;

    private String module;

    private Boolean level;

    private String ctl;

    private String act;

    private String title;

    private Boolean visible;

    private Short parentId;

    private Short orderby;

    private String icon;

    public SystemModule(Short modId, String module, Boolean level, String ctl, String act, String title, Boolean visible, Short parentId, Short orderby, String icon) {
        this.modId = modId;
        this.module = module;
        this.level = level;
        this.ctl = ctl;
        this.act = act;
        this.title = title;
        this.visible = visible;
        this.parentId = parentId;
        this.orderby = orderby;
        this.icon = icon;
    }

    public SystemModule() {
        super();
    }

    public Short getModId() {
        return modId;
    }

    public void setModId(Short modId) {
        this.modId = modId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public String getCtl() {
        return ctl;
    }

    public void setCtl(String ctl) {
        this.ctl = ctl == null ? null : ctl.trim();
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act == null ? null : act.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public Short getOrderby() {
        return orderby;
    }

    public void setOrderby(Short orderby) {
        this.orderby = orderby;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}