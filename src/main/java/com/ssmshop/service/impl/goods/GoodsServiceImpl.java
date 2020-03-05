package com.ssmshop.service.impl.goods;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsMapper;
import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.GoodsExample;
import com.ssmshop.service.goods.IGoodsService;
import com.ssmshop.service.impl.BaseServiceImpl;
import com.ssmshop.vo.goods.GoodsVo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iGoodsService")
public class GoodsServiceImpl extends BaseServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public ServerResponse list(int pageNum, int pageSize) {
        GoodsExample goodsExample = new GoodsExample();
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = this.goodsMapper.selectByExample(goodsExample);
        PageInfo pageInfo = new PageInfo(goodsList);
        return ServerResponse.createBySuccess(pageInfo);
    }
    @Override
    public ServerResponse list(int pageNum, int pageSize,String keywords) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if (!("".equals(keywords))){
            criteria.andGoodsNameLike("%"+keywords+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = this.goodsMapper.selectByExample(goodsExample);
        PageInfo pageInfo = new PageInfo(goodsList);
        return ServerResponse.createBySuccess(pageInfo);
    }
    @Override
    public ServerResponse list(int pageNum, int pageSize,GoodsVo goodsVo) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        try{
            if (goodsVo.getCatId()>0){
                criteria.andCatIdEqualTo(goodsVo.getCatId());
            }
            if (goodsVo.getBrandId()>0){
                criteria.andBrandIdEqualTo(goodsVo.getBrandId());
            }
            if (goodsVo.getIsHot() >0){
                criteria.andIsHotEqualTo(goodsVo.getIsHot());
            }
            if (goodsVo.getIsNew() >0 ){
                criteria.andIsNewEqualTo(goodsVo.getIsNew());
            }
            if (goodsVo.getIsOnSale() > 0){
                criteria.andIsOnSaleEqualTo(goodsVo.getIsOnSale());
            }
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = this.goodsMapper.selectByExample(goodsExample);
        PageInfo pageInfo = new PageInfo(goodsList);
        return ServerResponse.createBySuccess(pageInfo);
    }
    @Override
    public ServerResponse list(int pageNum, int pageSize,String keywords,GoodsVo goodsVo) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        System.out.println("+++++"+goodsVo.getCatId()+"++++++++"+goodsVo.getBrandId());
        try{
            if (!("".equals(keywords))){
                criteria.andGoodsNameLike("%"+keywords+"%");
            }
            if (goodsVo.getCatId()>0){
                criteria.andCatIdEqualTo(goodsVo.getCatId());
            }
            if (goodsVo.getBrandId()>0){
                criteria.andBrandIdEqualTo(goodsVo.getBrandId());
            }
            if (goodsVo.getIsHot() >0){
                criteria.andIsHotEqualTo(goodsVo.getIsHot());
            }
            if (goodsVo.getIsNew() >0 ){
                criteria.andIsNewEqualTo(goodsVo.getIsNew());
            }
            if (goodsVo.getIsOnSale() > 0){
                criteria.andIsOnSaleEqualTo(goodsVo.getIsOnSale());
            }
        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = this.goodsMapper.selectByExample(goodsExample);
        PageInfo pageInfo = new PageInfo(goodsList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<String> add(Goods goods) {
        return super.responseBase(this.goodsMapper.insertSelective(goods));
    }

    @Override
    public ServerResponse<String> remove(int goodsId) {
        if (goodsId>0){
            return super.responseBase(this.goodsMapper.deleteByPrimaryKey(goodsId));
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<Goods> edit(int goodsId, Goods goods) {

        if (goodsId > 0){
            goods.setGoodsId(goodsId);
            return super.responseBase(this.goodsMapper.updateByPrimaryKeySelective(goods));
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<Goods> detail(int goodsId) {
        if (goodsId > 0){
            return ServerResponse.createBySuccess(this.goodsMapper.selectByPrimaryKey(goodsId));
        }else{
            return ServerResponse.createByError();
        }


    }
}
