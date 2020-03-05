package com.ssmshop.service.goods;

import com.alibaba.fastjson.JSON;
import com.ssmshop.BaseTest;
import com.ssmshop.pojo.CommentWithBLOBs;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodsCommentTest extends BaseTest{
    @Autowired
    private IGoodsCommentService iGoodsCommentService;

    public GoodsCommentTest() {
        super(GoodsCommentTest.class);
    }

    @Test
    public void listTest(){
/*
* select count(*) from (select                 tp_comment.comment_id, tp_comment.goods_id, tp_comment.username, tp_comment.add_time, tp_comment.ip_address,     tp_comment.is_show, tp_comment.user_id,tp_goods.goods_name         from tp_comment,tp_goods where tp_comment.goods_id = tp_goods.goods_id                    WHERE (  username = "茱莉亚")) tmp_count
* */
        int pageNum = 1;
        int pageSize = 10;
        String username = "茱莉亚";
//        String username = "";
        String content = "";
        System.out.println(JSON.toJSON(this.iGoodsCommentService.list(pageNum,pageSize,username,content)));
    }

    @Test
    public void detailTest(){
        int commentId = 1;
        System.out.println(JSON.toJSON(this.iGoodsCommentService.detail(commentId)));
    }

    @Test
    public void editTest(){
        int commentId = 1;
        CommentWithBLOBs comment = new CommentWithBLOBs();
        comment.setIsShow((byte) 0);
        comment.setEmail("xiugaihou@xiugai.com");
        comment.setContent("修改后的评价测试");
        System.out.println(JSON.toJSON(this.iGoodsCommentService.edit(commentId,comment)));
    }

    @Test
    public void removeTest(){
        int commentId = 1;
        System.out.println(JSON.toJSON(this.iGoodsCommentService.remove(commentId)));
    }

    @Test
    public void addTest(){
        CommentWithBLOBs commentWithBLOBs = new CommentWithBLOBs();
        commentWithBLOBs.setGoodsId(39);
        commentWithBLOBs.setContent("添加测试评价");
        System.out.println(JSON.toJSON(this.iGoodsCommentService.add(commentWithBLOBs)));
    }
}
