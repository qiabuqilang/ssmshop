package com.ssmshop.service.impl.goods;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.CommentMapper;
import com.ssmshop.pojo.CommentExample;
import com.ssmshop.pojo.CommentWithBLOBs;
import com.ssmshop.service.goods.IGoodsCommentService;
import com.ssmshop.service.impl.BaseServiceImpl;
import com.ssmshop.vo.goods.GoodsCommentVo;
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
    public ServerResponse<?> detail(int commentId) {
        if (commentId > 0){
            return ServerResponse.createBySuccess(this.commentMapper.selectByPrimaryKey(commentId));
        }else{
            return ServerResponse.createByError();
        }


    }

    @Override
    public ServerResponse<?> edit(int commentId,CommentWithBLOBs comment) {
        if (commentId>0){
            comment.setCommentId(commentId);
            return super.responseBase(this.commentMapper.updateByPrimaryKeySelective(comment));
        }else{
            return ServerResponse.createByError();
        }


    }

    @Override
    public ServerResponse<String> remove(int commentId) {
        if (commentId > 0){
            return super.responseBase(this.commentMapper.deleteByPrimaryKey(commentId));
        }else{
            return ServerResponse.createByError();
        }


    }

    @Override
    public ServerResponse<String> add(CommentWithBLOBs comment) {
//    完成用户登录功能后需要写user_id,user_name,
        return super.responseBase(this.commentMapper.insertSelective(comment));
    }
}
