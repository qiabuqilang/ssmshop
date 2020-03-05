package com.ssmshop.service.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsAttribute;

public interface IGoodsAttributeService {
    ServerResponse<PageInfo> list(int pageNum,int pageSize,int goodsTypeId);
    ServerResponse<PageInfo> list(int pageNum,int pageSize);
    ServerResponse<String> add(GoodsAttribute goodsAttribute);
    ServerResponse<?> edit(GoodsAttribute goodsAttribute,int goodsAttributeId);
    ServerResponse<String> remove(int goodsAttributeId);
    ServerResponse<GoodsAttribute> detail(int goodsAttributeId);
}
