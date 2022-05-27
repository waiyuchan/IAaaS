package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.LocRegions;
import com.gbtech.iaaas.mbg.model.LocRegionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocRegionsMapper {
    long countByExample(LocRegionsExample example);

    int deleteByExample(LocRegionsExample example);

    int deleteByPrimaryKey(Short id);

    int insert(LocRegions record);

    int insertSelective(LocRegions record);

    List<LocRegions> selectByExample(LocRegionsExample example);

    LocRegions selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") LocRegions record, @Param("example") LocRegionsExample example);

    int updateByExample(@Param("record") LocRegions record, @Param("example") LocRegionsExample example);

    int updateByPrimaryKeySelective(LocRegions record);

    int updateByPrimaryKey(LocRegions record);
}