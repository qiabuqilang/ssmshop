package com.ssmshop.service.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Brand;
import com.ssmshop.service.IBaseService;

import java.util.List;

public interface IGoodsBrandService extends IBaseService {
    ServerResponse<PageInfo<Brand>> list(int pageNum, int pageSize);
    ServerResponse<PageInfo<Brand>> list(int pageNum,int pageSize,String keywords);
    ServerResponse<Brand> detail(int brandId);
    ServerResponse<String> add(Brand brand);
    ServerResponse<?> edit(int brandId,Brand brand);
    ServerResponse<String> remove(int brandId);

}
