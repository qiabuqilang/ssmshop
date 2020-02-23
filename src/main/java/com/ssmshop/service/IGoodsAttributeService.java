package com.ssmshop.service;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsAttribute;

public interface IGoodsAttributeService {
    ServerResponse<PageInfo> list(int pageNum,int pageSize,int goodsTypeId);
    ServerResponse<String> add(GoodsAttribute goodsAttribute,int goodsTypeId);
    ServerResponse<String> edit(GoodsAttribute goodsAttribute,int goodsAttributeId,int goodsTypeId);
    ServerResponse<String> remove(int goodsAttributeId);
    ServerResponse<GoodsAttribute> detail(int goodsAttributeId);
}
