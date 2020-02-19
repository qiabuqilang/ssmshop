package com.ssmshop.pojo;

public class Article {
    private Integer articleId;

    private Short catId;

    private String title;

    private String author;

    private String authorEmail;

    private String keywords;

    private Byte articleType;

    private Byte isOpen;

    private Integer addTime;

    private String fileUrl;

    private Byte openType;

    private String link;

    private Integer click;

    private Integer publishTime;

    private String thumb;

    public Article(Integer articleId, Short catId, String title, String author, String authorEmail, String keywords, Byte articleType, Byte isOpen, Integer addTime, String fileUrl, Byte openType, String link, Integer click, Integer publishTime, String thumb) {
        this.articleId = articleId;
        this.catId = catId;
        this.title = title;
        this.author = author;
        this.authorEmail = authorEmail;
        this.keywords = keywords;
        this.articleType = articleType;
        this.isOpen = isOpen;
        this.addTime = addTime;
        this.fileUrl = fileUrl;
        this.openType = openType;
        this.link = link;
        this.click = click;
        this.publishTime = publishTime;
        this.thumb = thumb;
    }

    public Article() {
        super();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail == null ? null : authorEmail.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Byte getArticleType() {
        return articleType;
    }

    public void setArticleType(Byte articleType) {
        this.articleType = articleType;
    }

    public Byte getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Byte getOpenType() {
        return openType;
    }

    public void setOpenType(Byte openType) {
        this.openType = openType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Integer getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Integer publishTime) {
        this.publishTime = publishTime;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }
}