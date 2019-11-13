package com.ssmshop.dao;

import com.ssmshop.pojo.SpecGoodsPrice;
import com.ssmshop.pojo.SpecGoodsPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecGoodsPriceMapper {
    int countByExample(SpecGoodsPriceExample example);

    int deleteByExample(SpecGoodsPriceExample example);

    int insert(SpecGoodsPrice record);

    int insertSelective(SpecGoodsPrice record);

    List<SpecGoodsPrice> selectByExample(SpecGoodsPriceExample example);

    int updateByExampleSelective(@Param("record") SpecGoodsPrice record, @Param("example") SpecGoodsPriceExample example);

    int updateByExample(@Param("record") SpecGoodsPrice record, @Param("example") SpecGoodsPriceExample example);
}