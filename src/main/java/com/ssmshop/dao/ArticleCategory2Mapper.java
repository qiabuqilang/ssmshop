package com.ssmshop.dao;

import com.ssmshop.pojo.ArticleCategory2;
import com.ssmshop.pojo.ArticleCategory2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCategory2Mapper {
    int countByExample(ArticleCategory2Example example);

    int deleteByExample(ArticleCategory2Example example);

    int deleteByPrimaryKey(Integer catId);

    int insert(ArticleCategory2 record);

    int insertSelective(ArticleCategory2 record);

    List<ArticleCategory2> selectByExample(ArticleCategory2Example example);

    ArticleCategory2 selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") ArticleCategory2 record, @Param("example") ArticleCategory2Example example);

    int updateByExample(@Param("record") ArticleCategory2 record, @Param("example") ArticleCategory2Example example);

    int updateByPrimaryKeySelective(ArticleCategory2 record);

    int updateByPrimaryKey(ArticleCategory2 record);
}