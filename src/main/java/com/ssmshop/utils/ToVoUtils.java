package com.ssmshop.utils;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class ToVoUtils<T,U> {
    private Class<T> tType;
    private Class<U> uType;

    public ToVoUtils(Class<T> tClass,Class<U> uClass){
            this.tType = tClass;
            this.uType = uClass;
    }

    public List<T> toVos(List<T> targetList,List<U> sourceList){

        for (U source: sourceList
             ) {
            try{
                T target = this.tType.newInstance();
                BeanUtils.copyProperties(source,target);
               targetList.add(target);
            }catch (InstantiationException i){
                i.getStackTrace();
            }catch (IllegalAccessException e){
                e.getStackTrace();
            }

        }
        return targetList;
    }
}
