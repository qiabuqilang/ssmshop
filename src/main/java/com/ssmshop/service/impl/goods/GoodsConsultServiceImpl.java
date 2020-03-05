package com.ssmshop.service.impl.goods;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsConsultMapper;
import com.ssmshop.pojo.GoodsConsult;
import com.ssmshop.pojo.GoodsConsultExample;
import com.ssmshop.service.goods.IGoodsConsultService;
import com.ssmshop.service.impl.BaseServiceImpl;
import com.ssmshop.vo.goods.GoodsConsultDetailVo;
import com.ssmshop.vo.goods.GoodsConsultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("iGoodsConsultService")
public class GoodsConsultServiceImpl extends BaseServiceImpl implements IGoodsConsultService {
    @Autowired
    private GoodsConsultMapper goodsConsultMapper;
    @Override
    public ServerResponse<PageInfo<GoodsConsultVo>> list(int pageNum, int pageSize, String username, String content) {
        GoodsConsultExample goodsConsultExample = new GoodsConsultExample();
        if (!"".equals(username)){
            goodsConsultExample.createCriteria().andUsernameLike("%"+username+"%");
        }
        if (!"".equals(content)){
            goodsConsultExample.createCriteria().andContentLike("%"+content+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsConsultVo> goodsConsultVos = this.goodsConsultMapper.listByExample(goodsConsultExample);
        PageInfo<GoodsConsultVo> pageInfo = new PageInfo(goodsConsultVos);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<?> detail(int consultId) {
        if (consultId>0){
            GoodsConsult goodsConsult = this.goodsConsultMapper.selectByPrimaryKey(consultId);
            GoodsConsultExample goodsConsultExample = new GoodsConsultExample();
            goodsConsultExample.createCriteria().andParentIdEqualTo(goodsConsult.getId());
            List<GoodsConsult> goodsConsultList = this.goodsConsultMapper.selectByExample(goodsConsultExample);
            GoodsConsultDetailVo goodsConsultDetailVo = new GoodsConsultDetailVo(goodsConsult,goodsConsultList);
            return ServerResponse.createBySuccess(goodsConsultDetailVo);
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> add(GoodsConsult goodsConsult) {
        return super.responseBase(this.goodsConsultMapper.insertSelective(goodsConsult));
    }

    @Override
    public ServerResponse<?> remove(int consultId) {
        if (consultId >0){
            return super.responseBase(this.goodsConsultMapper.deleteByPrimaryKey(consultId));
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> edit(int consultId, GoodsConsult goodsConsult) {
        if (consultId > 0){
            goodsConsult.setId(consultId);
            return super.responseBase(this.goodsConsultMapper.updateByPrimaryKeySelective(goodsConsult));
        }else{
            return ServerResponse.createByError();
        }
    }
}
