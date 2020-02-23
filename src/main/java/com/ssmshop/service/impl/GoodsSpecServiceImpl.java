package com.ssmshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.SpecMapper;
import com.ssmshop.pojo.Spec;
import com.ssmshop.pojo.SpecExample;
import com.ssmshop.service.IGoodsSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("iSpecService")
public class GoodsSpecServiceImpl extends BaseServiceImpl implements IGoodsSpecService {
    @Autowired
    private SpecMapper specMapper;
    @Override
    public ServerResponse<PageInfo> list(int pageNum, int pageSize,int goodsTypeId) {
        SpecExample specExample = new SpecExample();
        specExample.createCriteria().andTypeIdEqualTo(goodsTypeId);
        PageHelper.startPage(pageNum,pageSize);
        List<Spec> specList = this.specMapper.selectByExample(specExample);
        PageInfo pageInfo = new PageInfo(specList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<String> add(Spec spec,int goodsTypeId) {
        if (goodsTypeId>0){
            spec.setTypeId(goodsTypeId);
            return super.responseBase(this.specMapper.insertSelective(spec));
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<String> edit(int specId, Spec spec) {
        if (specId >0 ){
            spec.setId(specId);
            return  super.responseBase(this.specMapper.updateByPrimaryKeySelective(spec));
        }else {
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<String> remove(int specId) {
        if (specId > 0){
            return super.responseBase(this.specMapper.deleteByPrimaryKey(specId));
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<Spec> detail(int goodsSpecId) {
        return ServerResponse.createBySuccess(this.specMapper.selectByPrimaryKey(goodsSpecId));
    }
}
