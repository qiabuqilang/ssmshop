package com.ssmshop.service;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Goods;
import com.ssmshop.vo.GoodsVo;

public interface IGoodsService extends IBaseService{
    ServerResponse list(int pageNum, int pageSize);
    ServerResponse list(int pageNum, int pageSize,String keywords);
    ServerResponse list(int pageNum, int pageSize,GoodsVo goodsVo);
    ServerResponse list(int pageNum, int pageSize,String keywords,GoodsVo goodsVo);
    ServerResponse<String> add(Goods goods);
    ServerResponse<String> remove(int goodsId);
    ServerResponse<Goods> edit(int goodsId,Goods goods);
    ServerResponse<Goods> detail(int goodsId);

}
