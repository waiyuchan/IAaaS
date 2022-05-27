package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcAccessCard;
import com.gbtech.iaaas.mbg.model.AcAccessCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcAccessCardMapper {
    long countByExample(AcAccessCardExample example);

    int deleteByExample(AcAccessCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcAccessCard record);

    int insertSelective(AcAccessCard record);

    List<AcAccessCard> selectByExampleWithBLOBs(AcAccessCardExample example);

    List<AcAccessCard> selectByExample(AcAccessCardExample example);

    AcAccessCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcAccessCard record, @Param("example") AcAccessCardExample example);

    int updateByExampleWithBLOBs(@Param("record") AcAccessCard record, @Param("example") AcAccessCardExample example);

    int updateByExample(@Param("record") AcAccessCard record, @Param("example") AcAccessCardExample example);

    int updateByPrimaryKeySelective(AcAccessCard record);

    int updateByPrimaryKeyWithBLOBs(AcAccessCard record);

    int updateByPrimaryKey(AcAccessCard record);
}