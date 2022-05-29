package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcContract implements Serializable {
    @ApiModelProperty(value = "合同id，自增")
    private Integer id;

    @ApiModelProperty(value = "合同唯一标识码")
    private String cUnicode;

    @ApiModelProperty(value = "房间id")
    private Integer roomId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "用户账户名")
    private String username;

    @ApiModelProperty(value = "费用状态， 0: 未支付，1: 部分支付，2: 已支付")
    private Byte feeStatus;

    @ApiModelProperty(value = "付费账单id")
    private Integer feeOrderId;

    @ApiModelProperty(value = "是否转移，0: 已转移，1: 未转移")
    private Byte isTransfer;

    @ApiModelProperty(value = "转移前租户")
    private String preTenant;

    @ApiModelProperty(value = "是否续签，0: 已续签，1: 未续签")
    private Byte isRenew;

    @ApiModelProperty(value = "续签前合同id")
    private Integer preContractId;

    @ApiModelProperty(value = "状态，0: 已创建，未签署，1: 签署中，2:已签署，未支付，3：已支付，合同已生效，4: 合同已转移，本合同失效，5: 合同已续签，本合同失效")
    private Integer status;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    @ApiModelProperty(value = "修改时间，格式为: 2021-12-31 00:00:00")
    private Date modifyTime;

    @ApiModelProperty(value = "合同文件地址")
    private String contractFileUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcUnicode() {
        return cUnicode;
    }

    public void setcUnicode(String cUnicode) {
        this.cUnicode = cUnicode;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(Byte feeStatus) {
        this.feeStatus = feeStatus;
    }

    public Integer getFeeOrderId() {
        return feeOrderId;
    }

    public void setFeeOrderId(Integer feeOrderId) {
        this.feeOrderId = feeOrderId;
    }

    public Byte getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Byte isTransfer) {
        this.isTransfer = isTransfer;
    }

    public String getPreTenant() {
        return preTenant;
    }

    public void setPreTenant(String preTenant) {
        this.preTenant = preTenant;
    }

    public Byte getIsRenew() {
        return isRenew;
    }

    public void setIsRenew(Byte isRenew) {
        this.isRenew = isRenew;
    }

    public Integer getPreContractId() {
        return preContractId;
    }

    public void setPreContractId(Integer preContractId) {
        this.preContractId = preContractId;
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

    public String getContractFileUrl() {
        return contractFileUrl;
    }

    public void setContractFileUrl(String contractFileUrl) {
        this.contractFileUrl = contractFileUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cUnicode=").append(cUnicode);
        sb.append(", roomId=").append(roomId);
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", feeStatus=").append(feeStatus);
        sb.append(", feeOrderId=").append(feeOrderId);
        sb.append(", isTransfer=").append(isTransfer);
        sb.append(", preTenant=").append(preTenant);
        sb.append(", isRenew=").append(isRenew);
        sb.append(", preContractId=").append(preContractId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", contractFileUrl=").append(contractFileUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}