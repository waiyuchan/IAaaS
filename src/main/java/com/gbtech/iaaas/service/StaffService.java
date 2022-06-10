package com.gbtech.iaaas.service;

import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.mbg.model.AeStaffPermission;
import java.util.List;

public interface StaffService {

    int registerStaff(AeStaff aeStaff);

    List<AeStaff> getStaffList(int pageNum, int pageSize);

    AeStaff getStaffByUsername(String username);


    List<AeStaffPermission> getStaffPermissionList(int staffId);

    String login(String username, String password);
}
