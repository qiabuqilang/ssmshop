package com.ssmshop.pojo;

public class CommentWithBLOBs extends Comment {
    private String content;

    private String img;

    public CommentWithBLOBs(Integer commentId, Integer goodsId, String email, String username, Byte deliverRank, Integer addTime, String ipAddress, Byte isShow, Integer parentId, Integer userId, Integer orderId, Byte goodsRank, Byte serviceRank, String content, String img) {
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