package com.ssmshop.pojo;

public class CommentWithBLOBs extends Comment {
    private String content;

    private String img;

    public CommentWithBLOBs(Integer commentId, Integer goodsId, String email, String username, Boolean deliverRank, Integer addTime, String ipAddress, Boolean isShow, Integer parentId, Integer userId, Integer orderId, Boolean goodsRank, Boolean serviceRank, String content, String img) {
        super(commentId, goodsId, email, username, deliverRank, addTime, ipAddress, isShow, parentId, userId, orderId, goodsRank, serviceRank);
        this.content = content;
        this.img = img;
    }

    public CommentWithBLOBs() {
        super();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}