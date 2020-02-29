package com.ssmshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.BrandMapper;
import com.ssmshop.dao.GoodsCategoryMapper;
import com.ssmshop.pojo.Brand;
import com.ssmshop.pojo.BrandExample;
import com.ssmshop.pojo.GoodsCategory;
import com.ssmshop.pojo.GoodsCategoryExample;
import com.ssmshop.service.IGoodsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iGoodsBrandService")
public class GoodsBrandServiceImpl extends BaseServiceImpl implements IGoodsBrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;
    @Override
    public ServerResponse<PageInfo<Brand>> list(int pageNum, int pageSize) {
        BrandExample brandExample = new BrandExample();
        PageHelper.startPage(pageNum,pageSize);
        List<Brand> brandList = this.brandMapper.selectByExample(brandExample);
        PageInfo<Brand> pageInfo = new PageInfo<>(brandList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<PageInfo<Brand>> list(int pageNum, int pageSize, String keywords) {
        BrandExample brandExample = new BrandExample();
        brandExample.createCriteria().andNameEqualTo(keywords);
        PageHelper.startPage(pageNum,pageSize);
        List<Brand> brandList = this.brandMapper.selectByExample(brandExample);
        PageInfo<Brand> pageInfo = new PageInfo<>(brandList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<Brand> detail(int brandId) {
        return ServerResponse.createBySuccess(this.brandMapper.selectByPrimaryKey((short)brandId));
    }

    @Override
    public ServerResponse<String> add(Brand brand) {
        GoodsCategory goodsCategory;
        goodsCategory = this.goodsCategoryMapper.selectByPrimaryKey(brand.getCatId().shortValue());
        brand.setCatName(goodsCategory.getName());
        return super.responseBase(this.brandMapper.insertSelective(brand));
    }

    @Override
    public ServerResponse<?> edit(int brandId, Brand brand) {
        if (brandId >0){
            brand.setId((short) brandId);
            if (super.responseBase(this.brandMapper.updateByPrimaryKeySelective(brand)).isSuccess()){
                return ServerResponse.createBySuccess(brand);
            }else{
                return ServerResponse.createByError();
            }
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<String> remove(int brandId) {
        return super.responseBase(this.brandMapper.deleteByPrimaryKey((short)brandId));
    }
}
