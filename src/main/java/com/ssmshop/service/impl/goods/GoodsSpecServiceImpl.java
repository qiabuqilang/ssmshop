package com.ssmshop.service.impl.goods;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.SpecMapper;
import com.ssmshop.pojo.Spec;
import com.ssmshop.pojo.SpecExample;
import com.ssmshop.service.goods.IGoodsSpecService;
import com.ssmshop.service.impl.BaseServiceImpl;
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
    public ServerResponse<PageInfo> list(int pageNum, int pageSize) {
        SpecExample specExample = new SpecExample();
        specExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        List<Spec> specList = this.specMapper.selectByExample(specExample);
        PageInfo pageInfo = new PageInfo(specList);
        return ServerResponse.createBySuccess(pageInfo);
    }
    @Override
    public ServerResponse<String> add(Spec spec) {

        return super.responseBase(this.specMapper.insertSelective(spec));

    }

    @Override
    public ServerResponse<?> edit(int specId, Spec spec) {
        if (specId >0 ){
            spec.setId(specId);
            if (super.responseBase(this.specMapper.updateByPrimaryKeySelective(spec)).isSuccess()){
                return this.detail(specId);
            }else{
                return ServerResponse.createByError();
            }
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
