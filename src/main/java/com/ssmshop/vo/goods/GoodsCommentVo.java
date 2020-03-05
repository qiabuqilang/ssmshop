package com.ssmshop.vo.goods;

public class GoodsCommentVo {
//    tp_comment.comment_id, tp_comment.goods_id, tp_comment.username, tp_comment.add_time, tp_comment.ip_address,
//    (Integer,Integer,String,String,Integer,String,Byte,Integer) or values (1,1,Apple iPhone 6s Plus 16G 玫瑰金 移动联通电信4G手机,茱莉亚,1457746403,127.0.0.1,1,1)
//    tp.comment.is_show, tp_tp_comment.user_id, tp_goods.goods_name
//    Integer,Integer,String,String,Integer,String,Byte,Integer
    private Integer commentId;

    private Integer goodsId;

    private String goodsName;

    private String username;

    private Integer addTime;

    private String ipAddress;

    private Byte isShow;

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public GoodsCommentVo(Integer commentId, Integer goodsId, String goodsName, String username, Integer addTime, String ipAddress, Byte isShow, Integer userId) {
        this.commentId = commentId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.username = username;
        this.addTime = addTime;
        this.ipAddress = ipAddress;
        this.isShow = isShow;
        this.userId = userId;
    }
}
