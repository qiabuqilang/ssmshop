package com.ssmshop.controller.backend.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.controller.backend.BackendBaseController;
import com.ssmshop.pojo.CommentWithBLOBs;
import com.ssmshop.service.goods.IGoodsCommentService;
import com.ssmshop.vo.goods.GoodsCommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/goodsComment/")
@ResponseBody
public class GoodsCommentManageController extends BackendBaseController {
    @Autowired
    private IGoodsCommentService iGoodsCommentService;
    @RequestMapping("list.do")
    public ServerResponse<PageInfo<GoodsCommentVo>> list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam(value = "pageSize",defaultValue = "10") int pageSize,@RequestParam(value = "username",defaultValue = "")String username,@RequestParam(value = "content",defaultValue = "")String content){
        return this.iGoodsCommentService.list(pageNum,pageSize,username,content);
    }
    @RequestMapping("detail.do")
    public ServerResponse<?> detail(@RequestParam(value = "commentId",defaultValue = "0") int commentId){
        if (commentId > 0){
            return this.iGoodsCommentService.detail(commentId);
        }else{
            return ServerResponse.createByError();
        }

    }
    @RequestMapping(value = "edit.do",method = RequestMethod.POST)
    public ServerResponse<?> edit(@RequestParam(value = "commentId",defaultValue = "0")int commentId,CommentWithBLOBs comment){
        CommentWithBLOBs commentWithBLOBs = new CommentWithBLOBs();
        commentWithBLOBs.setCommentId(commentId);
        commentWithBLOBs.setIsShow(comment.getIsShow());
        return this.iGoodsCommentService.edit(commentId,commentWithBLOBs);
    }
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public ServerResponse<?> add(CommentWithBLOBs comment){
        return this.iGoodsCommentService.add(comment);
    }
    @RequestMapping(value = "remove.do",method = RequestMethod.POST)
    public ServerResponse<?> remove(@RequestParam(value = "commentId",defaultValue = "0")int commentId){
        return this.iGoodsCommentService.remove(commentId);
    }
}
