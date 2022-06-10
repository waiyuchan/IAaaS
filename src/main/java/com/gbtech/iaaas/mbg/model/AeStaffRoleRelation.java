package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AeStaffRoleRelation implements Serializable {
    @ApiModelProperty(value = "员工角色关系id，自增")
    private Byte id;

    @ApiModelProperty(value = "员工id")
    private Byte staffId;

    @ApiModelProperty(value = "角色id")
    private Byte roleId;

    private static final long serialVersionUID = 1L;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Byte getStaffId() {
        return staffId;
    }

    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
    }

    public Byte getRoleId() {
        return roleId;
    }

    public void setRoleId(Byte roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", staffId=").append(staffId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}