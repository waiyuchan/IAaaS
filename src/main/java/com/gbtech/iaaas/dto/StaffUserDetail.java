package com.gbtech.iaaas.dto;

import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.mbg.model.AeStaffPermission;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class StaffUserDetail implements UserDetails {

    private AeStaff staff;
    private List<AeStaffPermission> staffPermissionList;

    public StaffUserDetail(AeStaff staff, List<AeStaffPermission> staffPermissionList) {
        this.staff = staff;
        this.staffPermissionList = staffPermissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return staffPermissionList.stream()
                .filter(aeStaffPermission -> aeStaffPermission.getValue() != null)
                .map(aeStaffPermission -> new SimpleGrantedAuthority(
                        aeStaffPermission.getValue())).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return staff.getPassword();
    }

    @Override
    public String getUsername() {
        return staff.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return staff.getStatus().equals(0);
    }
}
