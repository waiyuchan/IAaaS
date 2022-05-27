package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.LocCities;
import com.gbtech.iaaas.mbg.model.LocCitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocCitiesMapper {
    long countByExample(LocCitiesExample example);

    int deleteByExample(LocCitiesExample example);

    int deleteByPrimaryKey(Short id);

    int insert(LocCities record);

    int insertSelective(LocCities record);

    List<LocCities> selectByExample(LocCitiesExample example);

    LocCities selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") LocCities record, @Param("example") LocCitiesExample example);

    int updateByExample(@Param("record") LocCities record, @Param("example") LocCitiesExample example);

    int updateByPrimaryKeySelective(LocCities record);

    int updateByPrimaryKey(LocCities record);
}