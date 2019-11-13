package com.ssmshop.dao;

import com.ssmshop.pojo.Plugin;
import com.ssmshop.pojo.PluginExample;
import com.ssmshop.pojo.PluginWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginMapper {
    int countByExample(PluginExample example);

    int deleteByExample(PluginExample example);

    int insert(PluginWithBLOBs record);

    int insertSelective(PluginWithBLOBs record);

    List<PluginWithBLOBs> selectByExampleWithBLOBs(PluginExample example);

    List<Plugin> selectByExample(PluginExample example);

    int updateByExampleSelective(@Param("record") PluginWithBLOBs record, @Param("example") PluginExample example);

    int updateByExampleWithBLOBs(@Param("record") PluginWithBLOBs record, @Param("example") PluginExample example);

    int updateByExample(@Param("record") Plugin record, @Param("example") PluginExample example);
}