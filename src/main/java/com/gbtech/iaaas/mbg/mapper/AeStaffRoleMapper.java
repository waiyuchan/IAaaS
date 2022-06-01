package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeStaffRole;
import com.gbtech.iaaas.mbg.model.AeStaffRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeStaffRoleMapper {
    long countByExample(AeStaffRoleExample example);

    int deleteByExample(AeStaffRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AeStaffRole record);

    int insertSelective(AeStaffRole record);

    List<AeStaffRole> selectByExample(AeStaffRoleExample example);

    AeStaffRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AeStaffRole record, @Param("example") AeStaffRoleExample example);

    int updateByExample(@Param("record") AeStaffRole record, @Param("example") AeStaffRoleExample example);

    int updateByPrimaryKeySelective(AeStaffRole record);

    int updateByPrimaryKey(AeStaffRole record);
}