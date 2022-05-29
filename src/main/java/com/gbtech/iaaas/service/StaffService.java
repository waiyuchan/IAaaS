package com.gbtech.iaaas.service;

import com.gbtech.iaaas.mbg.model.AeStaff;
import java.util.List;

public interface StaffService {

    int registerStaff(AeStaff aeStaff);

    List<AeStaff> getStaffList(int pageNum, int pageSize);

}
