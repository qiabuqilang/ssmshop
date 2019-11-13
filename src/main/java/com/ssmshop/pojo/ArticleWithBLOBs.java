package com.ssmshop.pojo;

public class ArticleWithBLOBs extends Article {
    private String content;

    private String description;

    public ArticleWithBLOBs(Integer articleId, Short catId, String title, String author, String authorEmail, String keywords, Boolean articleType, Boolean isOpen, Integer addTime, String fileUrl, Boolean openType, String link, Integer click, Integer publishTime, String thumb, String content, String description) {
        super(articleId, catId, title, author, authorEmail, keywords, articleType, isOpen, addTime, fileUrl, openType, link, click, publishTime, thumb);
        this.content = content;
        this.description = description;
    }

    public ArticleWithBLOBs() {
        super();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}