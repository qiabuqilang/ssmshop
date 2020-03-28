package com.ssmshop.service.promotion;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GroupBuy;

public interface IGroupBuyService {
    ServerResponse<PageInfo<GroupBuy>> list(int pageNum,int pageSize);
    ServerResponse<GroupBuy> detail(int groupBuyId);
    ServerResponse<?> add(GroupBuy groupBuy);
    ServerResponse<?> edit(int groupBuyId,GroupBuy groupBuy);
    ServerResponse<?> remove(int groupBuyId);
}
