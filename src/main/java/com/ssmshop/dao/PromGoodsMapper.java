package com.ssmshop.dao;

import com.ssmshop.pojo.PromGoods;
import com.ssmshop.pojo.PromGoodsExample;
import java.util.List;

import com.ssmshop.vo.promotion.PromGoodsDeatilVo;
import org.apache.ibatis.annotations.Param;

public interface PromGoodsMapper {
    int countByExample(PromGoodsExample example);

    int deleteByExample(PromGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PromGoods record);

    int insertSelective(PromGoods record);

    List<PromGoods> selectByExampleWithBLOBs(PromGoodsExample example);

    List<PromGoods> selectByExample(PromGoodsExample example);

    PromGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PromGoods record, @Param("example") PromGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") PromGoods record, @Param("example") PromGoodsExample example);

    int updateByExample(@Param("record") PromGoods record, @Param("example") PromGoodsExample example);

    int updateByPrimaryKeySelective(PromGoods record);

    int updateByPrimaryKeyWithBLOBs(PromGoods record);

    int updateByPrimaryKey(PromGoods record);
}