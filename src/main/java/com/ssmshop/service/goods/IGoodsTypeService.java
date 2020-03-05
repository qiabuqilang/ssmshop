package com.ssmshop.service.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.GoodsType;

public interface IGoodsTypeService {
    ServerResponse<PageInfo<GoodsType>> list(int pageNum,int pageSize);
    ServerResponse<String> add(GoodsType goodsType);
    ServerResponse<String> remove(int goodsTypeId);
    ServerResponse edit(int goodsTypeId,GoodsType goodsType);
    ServerResponse<GoodsType> detail(int goodsTypeId);
}
