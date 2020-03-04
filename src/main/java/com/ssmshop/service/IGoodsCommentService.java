package com.ssmshop.service;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Comment;
import com.ssmshop.pojo.CommentWithBLOBs;
import com.ssmshop.vo.GoodsCommentVo;

public interface IGoodsCommentService {
    ServerResponse<PageInfo<GoodsCommentVo>> list(int pageNum,int pageSize,String username,String content);
    ServerResponse<?> detail(int commentId);
    ServerResponse<?> edit(int commentId,CommentWithBLOBs comment);
    ServerResponse<?> remove(int commentId);
    ServerResponse<?> add(CommentWithBLOBs comment);

}
