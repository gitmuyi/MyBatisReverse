package com.yyc.yycframework.dao;

import com.yyc.yycframework.entity.ViewControllers;
import com.yyc.yycframework.entity.ViewControllersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewControllersMapper {
    long countByExample(ViewControllersExample example);

    int deleteByExample(ViewControllersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ViewControllers record);

    int insertSelective(ViewControllers record);

    List<ViewControllers> selectByExample(ViewControllersExample example);

    ViewControllers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ViewControllers record, @Param("example") ViewControllersExample example);

    int updateByExample(@Param("record") ViewControllers record, @Param("example") ViewControllersExample example);

    int updateByPrimaryKeySelective(ViewControllers record);

    int updateByPrimaryKey(ViewControllers record);
}