package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcInvoice implements Serializable {
    @ApiModelProperty(value = "发票id，自增")
    private Integer id;

    @ApiModelProperty(value = "费用账单id")
    private Integer feeOrderId;

    @ApiModelProperty(value = "发票申请人id")
    private Integer userId;

    @ApiModelProperty(value = "发票申请人id账户名")
    private String username;

    @ApiModelProperty(value = "机器编号")
    private String machineCode;

    @ApiModelProperty(value = "发票代码")
    private String invoiceCode;

    @ApiModelProperty(value = "发票号码")
    private String invoiceNumber;

    @ApiModelProperty(value = "校验码")
    private String checkCode;

    @ApiModelProperty(value = "条目")
    private String entry;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "数量")
    private String quantity;

    @ApiModelProperty(value = "单价，单位为分")
    private Integer price;

    @ApiModelProperty(value = "金额，单位为分")
    private Integer invoiceFee;

    @ApiModelProperty(value = "税率，保留小数点后")
    private Float taxRate;

    @ApiModelProperty(value = "税额，单位为分")
    private Integer taxFee;

    @ApiModelProperty(value = "发票总额，单位为分")
    private Integer amount;

    @ApiModelProperty(value = "发票总额大写")
    private String capitalizedAmout;

    @ApiModelProperty(value = "发票备注")
    private String remark;

    @ApiModelProperty(value = "收款人姓名")
    private String payeeName;

    @ApiModelProperty(value = "复核人姓名")
    private String reviewer;

    @ApiModelProperty(value = "开票人姓名")
    private String invoicePersonName;

    @ApiModelProperty(value = "开票方名称")
    private String billingPartyName;

    @ApiModelProperty(value = "开票方纳税人识别号")
    private String taxpayerIdentifyNumber;

    @ApiModelProperty(value = "开票方地址&电话")
    private String billingPartyAddressAndTelephone;

    @ApiModelProperty(value = "开票方开户行及电话")
    private String accountBankAndPhoneNumber;

    @ApiModelProperty(value = "状态，0: 开票中，1: 已开票，2: 开票异常")
    private Byte status;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    @ApiModelProperty(value = "发票文件地址")
    private String invoiceFileUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFeeOrderId() {
        return feeOrderId;
    }

    public void setFeeOrderId(Integer feeOrderId) {
        this.feeOrderId = feeOrderId;
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

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(Integer invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(Integer taxFee) {
        this.taxFee = taxFee;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCapitalizedAmout() {
        return capitalizedAmout;
    }

    public void setCapitalizedAmout(String capitalizedAmout) {
        this.capitalizedAmout = capitalizedAmout;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getInvoicePersonName() {
        return invoicePersonName;
    }

    public void setInvoicePersonName(String invoicePersonName) {
        this.invoicePersonName = invoicePersonName;
    }

    public String getBillingPartyName() {
        return billingPartyName;
    }

    public void setBillingPartyName(String billingPartyName) {
        this.billingPartyName = billingPartyName;
    }

    public String getTaxpayerIdentifyNumber() {
        return taxpayerIdentifyNumber;
    }

    public void setTaxpayerIdentifyNumber(String taxpayerIdentifyNumber) {
        this.taxpayerIdentifyNumber = taxpayerIdentifyNumber;
    }

    public String getBillingPartyAddressAndTelephone() {
        return billingPartyAddressAndTelephone;
    }

    public void setBillingPartyAddressAndTelephone(String billingPartyAddressAndTelephone) {
        this.billingPartyAddressAndTelephone = billingPartyAddressAndTelephone;
    }

    public String getAccountBankAndPhoneNumber() {
        return accountBankAndPhoneNumber;
    }

    public void setAccountBankAndPhoneNumber(String accountBankAndPhoneNumber) {
        this.accountBankAndPhoneNumber = accountBankAndPhoneNumber;
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

    public String getInvoiceFileUrl() {
        return invoiceFileUrl;
    }

    public void setInvoiceFileUrl(String invoiceFileUrl) {
        this.invoiceFileUrl = invoiceFileUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", feeOrderId=").append(feeOrderId);
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", machineCode=").append(machineCode);
        sb.append(", invoiceCode=").append(invoiceCode);
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", checkCode=").append(checkCode);
        sb.append(", entry=").append(entry);
        sb.append(", unit=").append(unit);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", invoiceFee=").append(invoiceFee);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", taxFee=").append(taxFee);
        sb.append(", amount=").append(amount);
        sb.append(", capitalizedAmout=").append(capitalizedAmout);
        sb.append(", remark=").append(remark);
        sb.append(", payeeName=").append(payeeName);
        sb.append(", reviewer=").append(reviewer);
        sb.append(", invoicePersonName=").append(invoicePersonName);
        sb.append(", billingPartyName=").append(billingPartyName);
        sb.append(", taxpayerIdentifyNumber=").append(taxpayerIdentifyNumber);
        sb.append(", billingPartyAddressAndTelephone=").append(billingPartyAddressAndTelephone);
        sb.append(", accountBankAndPhoneNumber=").append(accountBankAndPhoneNumber);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", invoiceFileUrl=").append(invoiceFileUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}