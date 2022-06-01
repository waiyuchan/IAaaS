package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeMsMenu;
import com.gbtech.iaaas.mbg.model.AeMsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeMsMenuMapper {
    long countByExample(AeMsMenuExample example);

    int deleteByExample(AeMsMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AeMsMenu record);

    int insertSelective(AeMsMenu record);

    List<AeMsMenu> selectByExample(AeMsMenuExample example);

    AeMsMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AeMsMenu record, @Param("example") AeMsMenuExample example);

    int updateByExample(@Param("record") AeMsMenu record, @Param("example") AeMsMenuExample example);

    int updateByPrimaryKeySelective(AeMsMenu record);

    int updateByPrimaryKey(AeMsMenu record);
}