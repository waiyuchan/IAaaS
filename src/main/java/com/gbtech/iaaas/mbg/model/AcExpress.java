package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcExpress implements Serializable {
    @ApiModelProperty(value = "物流记录id，自增")
    private Integer id;

    @ApiModelProperty(value = "快递单号")
    private String trackNumber;

    @ApiModelProperty(value = "快递公司")
    private String expressCompany;

    @ApiModelProperty(value = "寄件人")
    private String sender;

    @ApiModelProperty(value = "寄件人地址")
    private String senderAddress;

    @ApiModelProperty(value = "寄件人手机号码")
    private String senderMobilePhone;

    @ApiModelProperty(value = "寄件人邮箱")
    private String senderMail;

    @ApiModelProperty(value = "收件人")
    private String recipient;

    @ApiModelProperty(value = "收件人地址")
    private String recipientAddress;

    @ApiModelProperty(value = "收件人手机号码")
    private String recipientMobilePhone;

    @ApiModelProperty(value = "收件人邮箱")
    private String recipientMail;

    @ApiModelProperty(value = "签收人")
    private String signer;

    @ApiModelProperty(value = "签收人联系方式")
    private String signerContact;

    @ApiModelProperty(value = "寄出时间，格式为: 2021-12-31 00:00:00")
    private Date sendTime;

    @ApiModelProperty(value = "到达时间，格式为: 2021-12-31 00:00:00")
    private Date arriveTime;

    @ApiModelProperty(value = "签收时间，格式为: 2021-12-31 00:00:00")
    private Date signTime;

    @ApiModelProperty(value = "快递费用")
    private Integer expressFee;

    @ApiModelProperty(value = "是否已支付")
    private Byte isPaid;

    @ApiModelProperty(value = "状态，0: 已下单，未支付, 1: 已支付，未发货, 2: 已发货，运输中, 3: 已到达，未签收, 4: 已签收")
    private Byte status;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    @ApiModelProperty(value = "物流记录")
    private String expressRecords;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderMobilePhone() {
        return senderMobilePhone;
    }

    public void setSenderMobilePhone(String senderMobilePhone) {
        this.senderMobilePhone = senderMobilePhone;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getRecipientMobilePhone() {
        return recipientMobilePhone;
    }

    public void setRecipientMobilePhone(String recipientMobilePhone) {
        this.recipientMobilePhone = recipientMobilePhone;
    }

    public String getRecipientMail() {
        return recipientMail;
    }

    public void setRecipientMail(String recipientMail) {
        this.recipientMail = recipientMail;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public String getSignerContact() {
        return signerContact;
    }

    public void setSignerContact(String signerContact) {
        this.signerContact = signerContact;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Integer getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(Integer expressFee) {
        this.expressFee = expressFee;
    }

    public Byte getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Byte isPaid) {
        this.isPaid = isPaid;
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

    public String getExpressRecords() {
        return expressRecords;
    }

    public void setExpressRecords(String expressRecords) {
        this.expressRecords = expressRecords;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", trackNumber=").append(trackNumber);
        sb.append(", expressCompany=").append(expressCompany);
        sb.append(", sender=").append(sender);
        sb.append(", senderAddress=").append(senderAddress);
        sb.append(", senderMobilePhone=").append(senderMobilePhone);
        sb.append(", senderMail=").append(senderMail);
        sb.append(", recipient=").append(recipient);
        sb.append(", recipientAddress=").append(recipientAddress);
        sb.append(", recipientMobilePhone=").append(recipientMobilePhone);
        sb.append(", recipientMail=").append(recipientMail);
        sb.append(", signer=").append(signer);
        sb.append(", signerContact=").append(signerContact);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", arriveTime=").append(arriveTime);
        sb.append(", signTime=").append(signTime);
        sb.append(", expressFee=").append(expressFee);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", expressRecords=").append(expressRecords);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}