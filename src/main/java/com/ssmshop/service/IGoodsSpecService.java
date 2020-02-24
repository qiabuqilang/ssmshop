package com.ssmshop.service;

import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.pojo.Spec;
import net.sf.jsqlparser.schema.Server;

import java.util.List;

public interface IGoodsSpecService {
    ServerResponse<PageInfo> list(int pageNum, int pageSize,int goodsTypeId);
    ServerResponse<PageInfo> list(int pageNum, int pageSize);
    ServerResponse<String> add(Spec spec);
    ServerResponse<?> edit(int specId,Spec spec);
    ServerResponse<String> remove(int specId);
    ServerResponse<Spec> detail(int specId);

}
