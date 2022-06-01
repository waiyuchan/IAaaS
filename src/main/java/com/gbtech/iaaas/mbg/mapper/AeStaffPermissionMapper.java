package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeStaffPermission;
import com.gbtech.iaaas.mbg.model.AeStaffPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeStaffPermissionMapper {
    long countByExample(AeStaffPermissionExample example);

    int deleteByExample(AeStaffPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AeStaffPermission record);

    int insertSelective(AeStaffPermission record);

    List<AeStaffPermission> selectByExample(AeStaffPermissionExample example);

    AeStaffPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AeStaffPermission record, @Param("example") AeStaffPermissionExample example);

    int updateByExample(@Param("record") AeStaffPermission record, @Param("example") AeStaffPermissionExample example);

    int updateByPrimaryKeySelective(AeStaffPermission record);

    int updateByPrimaryKey(AeStaffPermission record);
}