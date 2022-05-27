package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcTransaction implements Serializable {
    @ApiModelProperty(value = "流水记录id，自增")
    private Integer id;

    @ApiModelProperty(value = "流水号")
    private Integer transactionId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "用户账户名")
    private String username;

    @ApiModelProperty(value = "流水明细")
    private String transDetail;

    @ApiModelProperty(value = "流水性质，0: 付款，1: 退款")
    private Byte transProperty;

    @ApiModelProperty(value = "费用类型，0: Bill，1: 住宿费，2: 场地租赁费")
    private Byte feeType;

    @ApiModelProperty(value = "付款渠道，0: 用户余额，1: 银行卡")
    private String paymentChannel;

    @ApiModelProperty(value = "交易金额，单位为分")
    private Integer transAmount;

    @ApiModelProperty(value = "付款方账户")
    private String payerAccount;

    @ApiModelProperty(value = "付款方名称")
    private String payerName;

    @ApiModelProperty(value = "付款方所属机构")
    private String payerInstitution;

    @ApiModelProperty(value = "收款方账户")
    private String recipientAccount;

    @ApiModelProperty(value = "收款方名称")
    private String recipientName;

    @ApiModelProperty(value = "收款方所属机构")
    private String recipientInstitution;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
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

    public String getTransDetail() {
        return transDetail;
    }

    public void setTransDetail(String transDetail) {
        this.transDetail = transDetail;
    }

    public Byte getTransProperty() {
        return transProperty;
    }

    public void setTransProperty(Byte transProperty) {
        this.transProperty = transProperty;
    }

    public Byte getFeeType() {
        return feeType;
    }

    public void setFeeType(Byte feeType) {
        this.feeType = feeType;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public Integer getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(Integer transAmount) {
        this.transAmount = transAmount;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerInstitution() {
        return payerInstitution;
    }

    public void setPayerInstitution(String payerInstitution) {
        this.payerInstitution = payerInstitution;
    }

    public String getRecipientAccount() {
        return recipientAccount;
    }

    public void setRecipientAccount(String recipientAccount) {
        this.recipientAccount = recipientAccount;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientInstitution() {
        return recipientInstitution;
    }

    public void setRecipientInstitution(String recipientInstitution) {
        this.recipientInstitution = recipientInstitution;
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
        sb.append(", transactionId=").append(transactionId);
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", transDetail=").append(transDetail);
        sb.append(", transProperty=").append(transProperty);
        sb.append(", feeType=").append(feeType);
        sb.append(", paymentChannel=").append(paymentChannel);
        sb.append(", transAmount=").append(transAmount);
        sb.append(", payerAccount=").append(payerAccount);
        sb.append(", payerName=").append(payerName);
        sb.append(", payerInstitution=").append(payerInstitution);
        sb.append(", recipientAccount=").append(recipientAccount);
        sb.append(", recipientName=").append(recipientName);
        sb.append(", recipientInstitution=").append(recipientInstitution);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}