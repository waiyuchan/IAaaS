package com.gbtech.iaaas.dao;

import com.gbtech.iaaas.mbg.model.AeStaffPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface StaffRoleRelationDao {

    List<AeStaffPermission> getStaffPermissionList(@Param("staffId") int staffId);

}
