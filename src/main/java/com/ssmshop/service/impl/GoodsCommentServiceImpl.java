package com.ssmshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.CommentMapper;
import com.ssmshop.pojo.CommentExample;
import com.ssmshop.pojo.CommentWithBLOBs;
import com.ssmshop.service.IGoodsCommentService;
import com.ssmshop.vo.GoodsCommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("iGoodsCommentService")
public class GoodsCommentServiceImpl extends BaseServiceImpl implements IGoodsCommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public ServerResponse<PageInfo<GoodsCommentVo>> list(int pageNum, int pageSize, String username, String content) {
        CommentExample commentExample = new CommentExample();
        if (!"".equals(username)){
            commentExample.createCriteria().andUsernameLike("%"+username+"%");
        }
        if (!"".equals(content)){

        }
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsCommentVo> goodsCommentVoList = this.commentMapper.selectListByExample(commentExample);
        PageInfo<GoodsCommentVo> pageInfo = new PageInfo<>(goodsCommentVoList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<CommentWithBLOBs> detail(int commentId) {
        return ServerResponse.createBySuccess(this.commentMapper.selectByPrimaryKey(commentId));

    }

    @Override
    public ServerResponse<?> edit(int commentId,CommentWithBLOBs comment) {
      comment.setCommentId(commentId);
      return super.responseBase(this.commentMapper.updateByPrimaryKeySelective(comment));

    }

    @Override
    public ServerResponse<String> remove(int commentId) {
      return super.responseBase(this.commentMapper.deleteByPrimaryKey(commentId));

    }

    @Override
    public ServerResponse<String> add(CommentWithBLOBs comment) {
//    完成用户登录功能后需要写user_id,user_name,
        return super.responseBase(this.commentMapper.insertSelective(comment));
    }
}
