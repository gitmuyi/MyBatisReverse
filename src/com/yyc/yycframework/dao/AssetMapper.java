package com.yyc.yycframework.dao;

import com.yyc.yycframework.entity.Asset;
import com.yyc.yycframework.entity.AssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetMapper {
    long countByExample(AssetExample example);

    int deleteByExample(AssetExample example);

    int deleteByPrimaryKey(String id);

    int insert(Asset record);

    int insertSelective(Asset record);

    List<Asset> selectByExample(AssetExample example);

    Asset selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);
}