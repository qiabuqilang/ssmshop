package com.ssmshop.dao;

import com.ssmshop.pojo.ReturnGoods;
import com.ssmshop.pojo.ReturnGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnGoodsMapper {
    int countByExample(ReturnGoodsExample example);

    int deleteByExample(ReturnGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReturnGoods record);

    int insertSelective(ReturnGoods record);

    List<ReturnGoods> selectByExample(ReturnGoodsExample example);

    ReturnGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReturnGoods record, @Param("example") ReturnGoodsExample example);

    int updateByExample(@Param("record") ReturnGoods record, @Param("example") ReturnGoodsExample example);

    int updateByPrimaryKeySelective(ReturnGoods record);

    int updateByPrimaryKey(ReturnGoods record);
}