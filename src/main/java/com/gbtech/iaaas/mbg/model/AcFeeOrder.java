package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcFeeOrder implements Serializable {
    @ApiModelProperty(value = "账单id，自增")
    private Integer id;

    @ApiModelProperty(value = "房间id")
    private Integer roomId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "用户账户名")
    private String username;

    @ApiModelProperty(value = "账单标题")
    private String orderTitle;

    @ApiModelProperty(value = "应付金额，单位为分")
    private Integer amountsPayable;

    @ApiModelProperty(value = "欠费金额，单位为分")
    private Integer arrears;

    @ApiModelProperty(value = "状态，0: 未支付，1: 部分支付，2: 已支付")
    private Byte status;

    @ApiModelProperty(value = "截止日期，格式为: 2021-12-31")
    private Date deadline;

    @ApiModelProperty(value = "支付时间，格式为: 2021-12-31 00:00:00")
    private Date paymentTime;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    @ApiModelProperty(value = "账单明细")
    private String orderDetail;

    @ApiModelProperty(value = "流水记录列表")
    private String orderFlowRecords;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public Integer getAmountsPayable() {
        return amountsPayable;
    }

    public void setAmountsPayable(Integer amountsPayable) {
        this.amountsPayable = amountsPayable;
    }

    public Integer getArrears() {
        return arrears;
    }

    public void setArrears(Integer arrears) {
        this.arrears = arrears;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getOrderFlowRecords() {
        return orderFlowRecords;
    }

    public void setOrderFlowRecords(String orderFlowRecords) {
        this.orderFlowRecords = orderFlowRecords;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roomId=").append(roomId);
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", orderTitle=").append(orderTitle);
        sb.append(", amountsPayable=").append(amountsPayable);
        sb.append(", arrears=").append(arrears);
        sb.append(", status=").append(status);
        sb.append(", deadline=").append(deadline);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderDetail=").append(orderDetail);
        sb.append(", orderFlowRecords=").append(orderFlowRecords);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}