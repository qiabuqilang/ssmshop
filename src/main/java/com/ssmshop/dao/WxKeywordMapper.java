package com.ssmshop.dao;

import com.ssmshop.pojo.WxKeyword;
import com.ssmshop.pojo.WxKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxKeywordMapper {
    int countByExample(WxKeywordExample example);

    int deleteByExample(WxKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxKeyword record);

    int insertSelective(WxKeyword record);

    List<WxKeyword> selectByExample(WxKeywordExample example);

    WxKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxKeyword record, @Param("example") WxKeywordExample example);

    int updateByExample(@Param("record") WxKeyword record, @Param("example") WxKeywordExample example);

    int updateByPrimaryKeySelective(WxKeyword record);

    int updateByPrimaryKey(WxKeyword record);
}