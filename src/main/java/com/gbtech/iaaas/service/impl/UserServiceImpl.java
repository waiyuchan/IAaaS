package com.gbtech.iaaas.service.impl;

import com.gbtech.iaaas.mbg.mapper.AcUserMapper;
import com.gbtech.iaaas.mbg.model.AcUser;
import com.gbtech.iaaas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private AcUserMapper userMapper;

    @Override
    public int registerUser(AcUser user) {
        return userMapper.insertSelective(user);
    }
}
