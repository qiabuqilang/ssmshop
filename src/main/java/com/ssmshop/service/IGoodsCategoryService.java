package com.ssmshop.service;

import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsCategory;
import com.ssmshop.vo.GoodsCategoryVo;

import java.util.List;

public interface IGoodsCategoryService extends IBaseService {
    ServerResponse<List<GoodsCategoryVo>> list();
    ServerResponse<String> add(GoodsCategory goodsCategory);
    ServerResponse<String> remove(int goodsCategoryId);
    ServerResponse<String> edit(GoodsCategory goodsCategory);

}
