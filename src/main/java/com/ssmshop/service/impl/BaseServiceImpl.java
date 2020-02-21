package com.ssmshop.service.impl;

import com.ssmshop.common.ServerResponse;
import com.ssmshop.service.IBaseService;
import com.ssmshop.utils.Dump;

import java.util.List;

public class BaseServiceImpl implements IBaseService {

    @Override
    public <T> void dump(List<T> List) {
           Dump.dumpAll(List);
    }

    @Override
    public <T> ServerResponse<T> responseBase(int res) {
      if (res > 0){
          return ServerResponse.createBySuccess();
      }else {
          return ServerResponse.createByError();
      }
    }
}
