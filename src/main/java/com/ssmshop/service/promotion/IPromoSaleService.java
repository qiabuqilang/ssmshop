package com.ssmshop.service.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.PromGoods;
import com.ssmshop.vo.promotion.PromGoodsDeatilVo;

public interface IPromoSaleService {
    ServerResponse<PageInfo<PromGoods>> list(int pageNum,int pageSize);
    ServerResponse<?> detail(Long promGoodsId);
    ServerResponse<?> add(PromGoods promGoods);
    ServerResponse<?> edit(Long promGoodsId,PromGoods promGoods);
    ServerResponse<String> remove(Long promGoodsId);
}
