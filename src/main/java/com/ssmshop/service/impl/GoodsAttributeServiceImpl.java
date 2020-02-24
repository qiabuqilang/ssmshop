package com.ssmshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsAttributeMapper;
import com.ssmshop.pojo.GoodsAttribute;
import com.ssmshop.pojo.GoodsAttributeExample;
import com.ssmshop.service.IGoodsAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iGoodsAttribute")
public class GoodsAttributeServiceImpl extends BaseServiceImpl implements IGoodsAttributeService {
    @Autowired
    private GoodsAttributeMapper goodsAttributeMapper;
    @Override
    public ServerResponse<PageInfo> list(int pageNum, int pageSize, int goodsTypeId) {
        GoodsAttributeExample goodsAttributeExample = new GoodsAttributeExample();
        goodsAttributeExample.createCriteria().andTypeIdEqualTo((short)goodsTypeId);
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsAttribute> goodsAttributeList = this.goodsAttributeMapper.selectByExample(goodsAttributeExample);
        PageInfo pageInfo = new PageInfo(goodsAttributeList);
        return ServerResponse.createBySuccess(pageInfo);
    }
    @Override
    public ServerResponse<PageInfo> list(int pageNum, int pageSize) {
        GoodsAttributeExample goodsAttributeExample = new GoodsAttributeExample();
        goodsAttributeExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsAttribute> goodsAttributeList = this.goodsAttributeMapper.selectByExample(goodsAttributeExample);
        PageInfo pageInfo = new PageInfo(goodsAttributeList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<String> add(GoodsAttribute goodsAttribute) {
        return super.responseBase(this.goodsAttributeMapper.insertSelective(goodsAttribute));

    }

    @Override
    public ServerResponse<?> edit(GoodsAttribute goodsAttribute, int goodsAttributeId) {
        if (goodsAttributeId>0){
            goodsAttribute.setAttrId(goodsAttributeId);
           if(super.responseBase(this.goodsAttributeMapper.updateByPrimaryKeySelective(goodsAttribute)).isSuccess()){
            return this.detail(goodsAttributeId);
           }else{
               return ServerResponse.createByError();
           }
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<String> remove(int goodsAttributeId) {
        if (goodsAttributeId > 0){
            return super.responseBase(this.goodsAttributeMapper.deleteByPrimaryKey(goodsAttributeId));
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<GoodsAttribute> detail(int goodsAttributeId) {
        if (goodsAttributeId > 0){
            return ServerResponse.createBySuccess(this.goodsAttributeMapper.selectByPrimaryKey(goodsAttributeId));
        }else{
            return ServerResponse.createByError();
            }

    }
}
