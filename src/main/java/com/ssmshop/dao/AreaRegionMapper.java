package com.ssmshop.dao;

import com.ssmshop.pojo.AreaRegionExample;
import com.ssmshop.pojo.AreaRegionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaRegionMapper {
    int countByExample(AreaRegionExample example);

    int deleteByExample(AreaRegionExample example);

    int deleteByPrimaryKey(AreaRegionKey key);

    int insert(AreaRegionKey record);

    int insertSelective(AreaRegionKey record);

    List<AreaRegionKey> selectByExample(AreaRegionExample example);

    int updateByExampleSelective(@Param("record") AreaRegionKey record, @Param("example") AreaRegionExample example);

    int updateByExample(@Param("record") AreaRegionKey record, @Param("example") AreaRegionExample example);
}