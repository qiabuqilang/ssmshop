package com.ssmshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsTypeMapper;
import com.ssmshop.pojo.GoodsType;
import com.ssmshop.pojo.GoodsTypeExample;
import com.ssmshop.service.IGoodsTypeService;
import net.sf.jsqlparser.schema.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iGoodsType")
public class GoodsTypeServiceImpl extends BaseServiceImpl implements IGoodsTypeService{
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Override
    public ServerResponse list(int pageNum,int pageSize) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsType> goodsTypeList = this.goodsTypeMapper.selectByExample(goodsTypeExample);
        PageInfo pageInfo = new PageInfo<>(goodsTypeList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<String> add(GoodsType goodsType) {
      return super.responseBase(this.goodsTypeMapper.insertSelective(goodsType));
    }

    @Override
    public ServerResponse<String> remove(int goodsTypeId) {
        if (goodsTypeId>0){
            return super.responseBase(this.goodsTypeMapper.deleteByPrimaryKey((short) goodsTypeId));
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override

    public ServerResponse edit(int goodsTypeId, GoodsType goodsType) {
       if (goodsTypeId >0){
           goodsType.setId((short) goodsTypeId);
           ServerResponse serverResponse = super.responseBase(this.goodsTypeMapper.updateByPrimaryKeySelective(goodsType));
           if (serverResponse.isSuccess()){
               return ServerResponse.createBySuccess(goodsType);
           }else{
               return ServerResponse.createByError();
           }

       }else{
           return ServerResponse.createByError();
       }
    }

    @Override
    public ServerResponse<GoodsType> detail(int goodsTypeId) {
        if (goodsTypeId>0){
            return ServerResponse.createBySuccess(this.goodsTypeMapper.selectByPrimaryKey((short)goodsTypeId));
        }else{
            return ServerResponse.createByError();
        }
    }
}
