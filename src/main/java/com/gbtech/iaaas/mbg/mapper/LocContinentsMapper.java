package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.LocContinents;
import com.gbtech.iaaas.mbg.model.LocContinentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocContinentsMapper {
    long countByExample(LocContinentsExample example);

    int deleteByExample(LocContinentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LocContinents record);

    int insertSelective(LocContinents record);

    List<LocContinents> selectByExample(LocContinentsExample example);

    LocContinents selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LocContinents record, @Param("example") LocContinentsExample example);

    int updateByExample(@Param("record") LocContinents record, @Param("example") LocContinentsExample example);

    int updateByPrimaryKeySelective(LocContinents record);

    int updateByPrimaryKey(LocContinents record);
}