package com.ssmshop.service;

import com.ssmshop.common.ServerResponse;

import java.util.List;

public interface IBase {
   <T> void dump(List<T> List);
   <T> ServerResponse<T> responseBase(int res);
}
