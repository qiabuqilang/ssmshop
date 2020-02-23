package com.ssmshop.service;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.GoodsType;

public interface IGoodsTypeService {
    ServerResponse<PageInfo<GoodsType>> list(int pageNum,int pageSize);
    ServerResponse<String> add(GoodsType goodsType);
    ServerResponse<String> remove(int goodsTypeId);
    ServerResponse<String> edit(int goodsTypeId,GoodsType goodsType);
}
