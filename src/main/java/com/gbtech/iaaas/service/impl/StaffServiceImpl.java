package com.gbtech.iaaas.service.impl;

import com.gbtech.iaaas.mbg.mapper.AeStaffMapper;
import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.mbg.model.AeStaffExample;
import com.gbtech.iaaas.service.StaffService;
import com.github.pagehelper.PageHelper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StaffServiceImpl")
public class StaffServiceImpl implements StaffService {

    @Autowired
    private AeStaffMapper aeStaffMapper;

    @Override
    public int registerStaff(AeStaff aeStaff) {
        return aeStaffMapper.insertSelective(aeStaff);
    }

    @Override
    public List<AeStaff> getStaffList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return aeStaffMapper.selectByExample(new AeStaffExample());
    }
}
