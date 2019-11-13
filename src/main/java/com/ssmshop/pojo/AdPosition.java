package com.ssmshop.pojo;

public class AdPosition {
    private Integer positionId;

    private String positionName;

    private Short adWidth;

    private Short adHeight;

    private String positionDesc;

    private Boolean isOpen;

    private String positionStyle;

    public AdPosition(Integer positionId, String positionName, Short adWidth, Short adHeight, String positionDesc, Boolean isOpen, String positionStyle) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.adWidth = adWidth;
        this.adHeight = adHeight;
        this.positionDesc = positionDesc;
        this.isOpen = isOpen;
        this.positionStyle = positionStyle;
    }

    public AdPosition() {
        super();
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public Short getAdWidth() {
        return adWidth;
    }

    public void setAdWidth(Short adWidth) {
        this.adWidth = adWidth;
    }

    public Short getAdHeight() {
        return adHeight;
    }

    public void setAdHeight(Short adHeight) {
        this.adHeight = adHeight;
    }

    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc == null ? null : positionDesc.trim();
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getPositionStyle() {
        return positionStyle;
    }

    public void setPositionStyle(String positionStyle) {
        this.positionStyle = positionStyle == null ? null : positionStyle.trim();
    }
}