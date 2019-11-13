package com.ssmshop.dao;

import com.ssmshop.pojo.GoodsActivity;
import com.ssmshop.pojo.GoodsActivityExample;
import com.ssmshop.pojo.GoodsActivityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsActivityMapper {
    int countByExample(GoodsActivityExample example);

    int deleteByExample(GoodsActivityExample example);

    int deleteByPrimaryKey(Integer actId);

    int insert(GoodsActivityWithBLOBs record);

    int insertSelective(GoodsActivityWithBLOBs record);

    List<GoodsActivityWithBLOBs> selectByExampleWithBLOBs(GoodsActivityExample example);

    List<GoodsActivity> selectByExample(GoodsActivityExample example);

    GoodsActivityWithBLOBs selectByPrimaryKey(Integer actId);

    int updateByExampleSelective(@Param("record") GoodsActivityWithBLOBs record, @Param("example") GoodsActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsActivityWithBLOBs record, @Param("example") GoodsActivityExample example);

    int updateByExample(@Param("record") GoodsActivity record, @Param("example") GoodsActivityExample example);

    int updateByPrimaryKeySelective(GoodsActivityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsActivityWithBLOBs record);

    int updateByPrimaryKey(GoodsActivity record);
}