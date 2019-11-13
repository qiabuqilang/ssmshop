package com.ssmshop.dao;

import com.ssmshop.pojo.VirtualShop;
import com.ssmshop.pojo.VirtualShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VirtualShopMapper {
    int countByExample(VirtualShopExample example);

    int deleteByExample(VirtualShopExample example);

    int insert(VirtualShop record);

    int insertSelective(VirtualShop record);

    List<VirtualShop> selectByExampleWithBLOBs(VirtualShopExample example);

    List<VirtualShop> selectByExample(VirtualShopExample example);

    int updateByExampleSelective(@Param("record") VirtualShop record, @Param("example") VirtualShopExample example);

    int updateByExampleWithBLOBs(@Param("record") VirtualShop record, @Param("example") VirtualShopExample example);

    int updateByExample(@Param("record") VirtualShop record, @Param("example") VirtualShopExample example);
}