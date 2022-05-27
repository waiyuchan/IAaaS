package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcDepositAndWithdrawal implements Serializable {
    @ApiModelProperty(value = "流水记录id")
    private Integer id;

    @ApiModelProperty(value = "关联记录id")
    private Integer walletCardLinkId;

    @ApiModelProperty(value = "用户账户名")
    private String username;

    @ApiModelProperty(value = "操作类型，0: 充值，1: 提现")
    private Byte type;

    @ApiModelProperty(value = "金额")
    private Integer money;

    @ApiModelProperty(value = "银行卡安全码")
    private String securityCode;

    @ApiModelProperty(value = "创建时间，格式为: 2021-12-31 00:00:00")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWalletCardLinkId() {
        return walletCardLinkId;
    }

    public void setWalletCardLinkId(Integer walletCardLinkId) {
        this.walletCardLinkId = walletCardLinkId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
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
        sb.append(", walletCardLinkId=").append(walletCardLinkId);
        sb.append(", username=").append(username);
        sb.append(", type=").append(type);
        sb.append(", money=").append(money);
        sb.append(", securityCode=").append(securityCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}