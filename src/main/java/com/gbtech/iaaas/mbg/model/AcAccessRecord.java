package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcAccessRecord implements Serializable {
    @ApiModelProperty(value = "门禁权限id，自增")
    private Integer id;

    @ApiModelProperty(value = "门禁卡id")
    private Integer accessCardId;

    @ApiModelProperty(value = "公共门禁id")
    private Integer publicAccessControlId;

    @ApiModelProperty(value = "房间门禁id")
    private Integer roomAccessControlId;

    @ApiModelProperty(value = "操作类型，0: 进门，1: 出门")
    private Byte operateType;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccessCardId() {
        return accessCardId;
    }

    public void setAccessCardId(Integer accessCardId) {
        this.accessCardId = accessCardId;
    }

    public Integer getPublicAccessControlId() {
        return publicAccessControlId;
    }

    public void setPublicAccessControlId(Integer publicAccessControlId) {
        this.publicAccessControlId = publicAccessControlId;
    }

    public Integer getRoomAccessControlId() {
        return roomAccessControlId;
    }

    public void setRoomAccessControlId(Integer roomAccessControlId) {
        this.roomAccessControlId = roomAccessControlId;
    }

    public Byte getOperateType() {
        return operateType;
    }

    public void setOperateType(Byte operateType) {
        this.operateType = operateType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accessCardId=").append(accessCardId);
        sb.append(", publicAccessControlId=").append(publicAccessControlId);
        sb.append(", roomAccessControlId=").append(roomAccessControlId);
        sb.append(", operateType=").append(operateType);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}