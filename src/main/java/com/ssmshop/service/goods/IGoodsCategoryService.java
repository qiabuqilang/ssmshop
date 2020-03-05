package com.ssmshop.service.goods;

import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsCategory;
import com.ssmshop.service.IBaseService;
import com.ssmshop.vo.goods.GoodsCategoryVo;

import java.util.List;

public interface IGoodsCategoryService extends IBaseService {
    ServerResponse<List<GoodsCategoryVo>> list();
    ServerResponse<String> add(GoodsCategory goodsCategory);
    ServerResponse<String> remove(int goodsCategoryId);
    ServerResponse<String> edit(GoodsCategory goodsCategory);

}
