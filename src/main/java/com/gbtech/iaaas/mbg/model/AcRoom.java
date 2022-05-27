package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcRoom implements Serializable {
    @ApiModelProperty(value = "房间id，自增")
    private Integer id;

    @ApiModelProperty(value = "所属公寓id")
    private Integer acId;

    @ApiModelProperty(value = "房间号")
    private String roomNum;

    @ApiModelProperty(value = "子房间号")
    private String subRoomNum;

    @ApiModelProperty(value = "房间类型")
    private Byte type;

    @ApiModelProperty(value = "所在楼层")
    private Integer floor;

    @ApiModelProperty(value = "状态，0: 正常，1: 异常")
    private Byte status;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    @ApiModelProperty(value = "修改时间，格式为: 2021-12-31 00:00:00")
    private Date modifyTime;

    @ApiModelProperty(value = "配套物料列表")
    private String materials;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getSubRoomNum() {
        return subRoomNum;
    }

    public void setSubRoomNum(String subRoomNum) {
        this.subRoomNum = subRoomNum;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", acId=").append(acId);
        sb.append(", roomNum=").append(roomNum);
        sb.append(", subRoomNum=").append(subRoomNum);
        sb.append(", type=").append(type);
        sb.append(", floor=").append(floor);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", materials=").append(materials);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}