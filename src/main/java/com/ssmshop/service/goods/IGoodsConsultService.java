package com.ssmshop.service.goods;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.GoodsConsult;
import com.ssmshop.vo.goods.GoodsConsultVo;

public interface IGoodsConsultService {
    ServerResponse<PageInfo<GoodsConsultVo>> list(int pageNum,int pageSize,String username,String content);
    ServerResponse<?> detail(int consultId);
    ServerResponse<?> add(GoodsConsult goodsConsult);
    ServerResponse<?> remove(int consultId);
    ServerResponse<?> edit(int consultId,GoodsConsult goodsConsult);
}
