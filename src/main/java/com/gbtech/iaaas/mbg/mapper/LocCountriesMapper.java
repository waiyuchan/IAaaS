package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.LocCountries;
import com.gbtech.iaaas.mbg.model.LocCountriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocCountriesMapper {
    long countByExample(LocCountriesExample example);

    int deleteByExample(LocCountriesExample example);

    int deleteByPrimaryKey(Short id);

    int insert(LocCountries record);

    int insertSelective(LocCountries record);

    List<LocCountries> selectByExampleWithBLOBs(LocCountriesExample example);

    List<LocCountries> selectByExample(LocCountriesExample example);

    LocCountries selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") LocCountries record, @Param("example") LocCountriesExample example);

    int updateByExampleWithBLOBs(@Param("record") LocCountries record, @Param("example") LocCountriesExample example);

    int updateByExample(@Param("record") LocCountries record, @Param("example") LocCountriesExample example);

    int updateByPrimaryKeySelective(LocCountries record);

    int updateByPrimaryKeyWithBLOBs(LocCountries record);

    int updateByPrimaryKey(LocCountries record);
}