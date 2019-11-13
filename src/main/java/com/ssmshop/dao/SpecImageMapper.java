package com.ssmshop.dao;

import com.ssmshop.pojo.SpecImage;
import com.ssmshop.pojo.SpecImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecImageMapper {
    int countByExample(SpecImageExample example);

    int deleteByExample(SpecImageExample example);

    int insert(SpecImage record);

    int insertSelective(SpecImage record);

    List<SpecImage> selectByExample(SpecImageExample example);

    int updateByExampleSelective(@Param("record") SpecImage record, @Param("example") SpecImageExample example);

    int updateByExample(@Param("record") SpecImage record, @Param("example") SpecImageExample example);
}