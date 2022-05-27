package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcBuilding;
import com.gbtech.iaaas.mbg.model.AcBuildingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcBuildingMapper {
    long countByExample(AcBuildingExample example);

    int deleteByExample(AcBuildingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcBuilding record);

    int insertSelective(AcBuilding record);

    List<AcBuilding> selectByExample(AcBuildingExample example);

    AcBuilding selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcBuilding record, @Param("example") AcBuildingExample example);

    int updateByExample(@Param("record") AcBuilding record, @Param("example") AcBuildingExample example);

    int updateByPrimaryKeySelective(AcBuilding record);

    int updateByPrimaryKey(AcBuilding record);
}