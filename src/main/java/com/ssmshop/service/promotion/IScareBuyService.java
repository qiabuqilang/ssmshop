package com.ssmshop.service.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.FlashSale;

public interface IScareBuyService {
    ServerResponse<PageInfo<FlashSale>> list(int pageNum,int pageSize);
    ServerResponse<FlashSale> detail(Long flashSaleId);
    ServerResponse<?> add(FlashSale flashSale);
    ServerResponse<?> edit(Long flashSaleId,FlashSale flashSale);
    ServerResponse<?> remove(Long flashSaleId);
}
