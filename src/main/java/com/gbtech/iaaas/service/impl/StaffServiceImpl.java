package com.gbtech.iaaas.service.impl;

import com.gbtech.iaaas.dao.StaffRoleRelationDao;
import com.gbtech.iaaas.mbg.mapper.AeStaffMapper;
import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.mbg.model.AeStaffExample;
import com.gbtech.iaaas.mbg.model.AeStaffPermission;
import com.gbtech.iaaas.service.StaffService;
import com.github.pagehelper.PageHelper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StaffServiceImpl")
public class StaffServiceImpl implements StaffService {

    @Autowired
    private AeStaffMapper aeStaffMapper;

    @Autowired
    private StaffRoleRelationDao staffRoleRelationDao;

    @Override
    public int registerStaff(AeStaff aeStaff) {
        return aeStaffMapper.insertSelective(aeStaff);
    }

    @Override
    public List<AeStaff> getStaffList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return aeStaffMapper.selectByExample(new AeStaffExample());
    }

    @Override
    public AeStaff getStaffByUsername(String username) {
        AeStaffExample example = new AeStaffExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<AeStaff> staffList = aeStaffMapper.selectByExample(example);
        if (staffList != null && staffList.size() > 0) {
            return staffList.get(0);
        }
        return null;
    }

    @Override
    public List<AeStaffPermission> getStaffPermissionList(int staffId) {
        return staffRoleRelationDao.getStaffPermissionList(staffId);
    }
}
