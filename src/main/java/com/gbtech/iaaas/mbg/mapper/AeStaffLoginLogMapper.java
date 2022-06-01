package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeStaffLoginLog;
import com.gbtech.iaaas.mbg.model.AeStaffLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeStaffLoginLogMapper {
    long countByExample(AeStaffLoginLogExample example);

    int deleteByExample(AeStaffLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AeStaffLoginLog record);

    int insertSelective(AeStaffLoginLog record);

    List<AeStaffLoginLog> selectByExample(AeStaffLoginLogExample example);

    AeStaffLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AeStaffLoginLog record, @Param("example") AeStaffLoginLogExample example);

    int updateByExample(@Param("record") AeStaffLoginLog record, @Param("example") AeStaffLoginLogExample example);

    int updateByPrimaryKeySelective(AeStaffLoginLog record);

    int updateByPrimaryKey(AeStaffLoginLog record);
}