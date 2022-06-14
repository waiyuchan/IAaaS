package com.gbtech.iaaas.service.impl;

import com.gbtech.iaaas.common.utils.JwtTokenUtil;
import com.gbtech.iaaas.controller.manage.AccommodationController;
import com.gbtech.iaaas.dao.StaffRoleRelationDao;
import com.gbtech.iaaas.mbg.mapper.AeStaffMapper;
import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.mbg.model.AeStaffExample;
import com.gbtech.iaaas.mbg.model.AeStaffPermission;
import com.gbtech.iaaas.service.StaffService;
import com.github.pagehelper.PageHelper;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("StaffServiceImpl")
public class StaffServiceImpl implements StaffService {

    @Autowired
    @Lazy
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    @Lazy
    private PasswordEncoder passwordEncoder;

    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private AeStaffMapper aeStaffMapper;

    @Autowired
    private StaffRoleRelationDao staffRoleRelationDao;

    private static final Logger logger = LoggerFactory.getLogger(AccommodationController.class);

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

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            logger.info("用户信息查询结果：{}", userDetails.getUsername());
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                    userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            logger.warn("登陆异常:{}", e.getMessage());
        }
        return token;
    }
}
