package com.ssmshop.pojo;

public class Topic {
    private Integer topicId;

    private String topicTitle;

    private String topicImage;

    private String topicBackgroundColor;

    private String topicBackground;

    private String topicRepeat;

    private Byte topicState;

    private Byte topicMarginTop;

    private Integer ctime;

    private String topicContent;

    public Topic(Integer topicId, String topicTitle, String topicImage, String topicBackgroundColor, String topicBackground, String topicRepeat, Byte topicState, Byte topicMarginTop, Integer ctime, String topicContent) {
        this.topicId = topicId;
        this.topicTitle = topicTitle;
        this.topicImage = topicImage;
        this.topicBackgroundColor = topicBackgroundColor;
        this.topicBackground = topicBackground;
        this.topicRepeat = topicRepeat;
        this.topicState = topicState;
        this.topicMarginTop = topicMarginTop;
        this.ctime = ctime;
        this.topicContent = topicContent;
    }

    public Topic() {
        super();
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle == null ? null : topicTitle.trim();
    }

    public String getTopicImage() {
        return topicImage;
    }

    public void setTopicImage(String topicImage) {
        this.topicImage = topicImage == null ? null : topicImage.trim();
    }

    public String getTopicBackgroundColor() {
        return topicBackgroundColor;
    }

    public void setTopicBackgroundColor(String topicBackgroundColor) {
        this.topicBackgroundColor = topicBackgroundColor == null ? null : topicBackgroundColor.trim();
    }

    public String getTopicBackground() {
        return topicBackground;
    }

    public void setTopicBackground(String topicBackground) {
        this.topicBackground = topicBackground == null ? null : topicBackground.trim();
    }

    public String getTopicRepeat() {
        return topicRepeat;
    }

    public void setTopicRepeat(String topicRepeat) {
        this.topicRepeat = topicRepeat == null ? null : topicRepeat.trim();
    }

    public Byte getTopicState() {
        return topicState;
    }

    public void setTopicState(Byte topicState) {
        this.topicState = topicState;
    }

    public Byte getTopicMarginTop() {
        return topicMarginTop;
    }

    public void setTopicMarginTop(Byte topicMarginTop) {
        this.topicMarginTop = topicMarginTop;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent == null ? null : topicContent.trim();
    }
}