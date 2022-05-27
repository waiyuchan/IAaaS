package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.LocArea;
import com.gbtech.iaaas.mbg.model.LocAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocAreaMapper {
    long countByExample(LocAreaExample example);

    int deleteByExample(LocAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LocArea record);

    int insertSelective(LocArea record);

    List<LocArea> selectByExample(LocAreaExample example);

    LocArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LocArea record, @Param("example") LocAreaExample example);

    int updateByExample(@Param("record") LocArea record, @Param("example") LocAreaExample example);

    int updateByPrimaryKeySelective(LocArea record);

    int updateByPrimaryKey(LocArea record);
}