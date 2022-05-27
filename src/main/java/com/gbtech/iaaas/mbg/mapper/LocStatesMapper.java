package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.LocStates;
import com.gbtech.iaaas.mbg.model.LocStatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocStatesMapper {
    long countByExample(LocStatesExample example);

    int deleteByExample(LocStatesExample example);

    int deleteByPrimaryKey(Short id);

    int insert(LocStates record);

    int insertSelective(LocStates record);

    List<LocStates> selectByExample(LocStatesExample example);

    LocStates selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") LocStates record, @Param("example") LocStatesExample example);

    int updateByExample(@Param("record") LocStates record, @Param("example") LocStatesExample example);

    int updateByPrimaryKeySelective(LocStates record);

    int updateByPrimaryKey(LocStates record);
}