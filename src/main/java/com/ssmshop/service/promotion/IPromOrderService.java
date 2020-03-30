package com.ssmshop.service.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.PromOrder;

public interface IPromOrderService {
    ServerResponse<PageInfo<PromOrder>> list(int pageNum, int pageSize);
    ServerResponse<?> detail(Long promOrderId);
    ServerResponse<?> add(PromOrder promOrder);
    ServerResponse<?> edit(Long promOrderId,PromOrder promOrder);
    ServerResponse<?> remove(Long promOrderId);
}
