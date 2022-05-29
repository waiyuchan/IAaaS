package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcBuilding implements Serializable {
    @ApiModelProperty(value = "公寓id，自增")
    private Integer id;

    @ApiModelProperty(value = "公寓名称")
    private String name;

    @ApiModelProperty(value = "公寓英文名")
    private String engName;

    @ApiModelProperty(value = "公寓联系电话")
    private String telephone;

    @ApiModelProperty(value = "公寓联系邮箱")
    private String email;

    @ApiModelProperty(value = "公寓地址")
    private String address;

    @ApiModelProperty(value = "公寓邮编")
    private String postcode;

    @ApiModelProperty(value = "公寓负责人")
    private String owner;

    @ApiModelProperty(value = "公寓楼层数量")
    private Integer floorSum;

    @ApiModelProperty(value = "公寓住房数量")
    private Integer roomSum;

    @ApiModelProperty(value = "状态，0: 正常，1: 已注销")
    private Integer status;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    @ApiModelProperty(value = "修改时间，格式为: 2021-12-31 00:00:00")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getFloorSum() {
        return floorSum;
    }

    public void setFloorSum(Integer floorSum) {
        this.floorSum = floorSum;
    }

    public Integer getRoomSum() {
        return roomSum;
    }

    public void setRoomSum(Integer roomSum) {
        this.roomSum = roomSum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", engName=").append(engName);
        sb.append(", telephone=").append(telephone);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append(", postcode=").append(postcode);
        sb.append(", owner=").append(owner);
        sb.append(", floorSum=").append(floorSum);
        sb.append(", roomSum=").append(roomSum);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}