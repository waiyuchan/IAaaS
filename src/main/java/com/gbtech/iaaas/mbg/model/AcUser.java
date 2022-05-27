package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AcUser implements Serializable {
    @ApiModelProperty(value = "用户id，自增")
    private Integer id;

    @ApiModelProperty(value = "用户账户名，每个用户唯一")
    private String username;

    @ApiModelProperty(value = "用户密码，加密存储")
    private String password;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "英文名，非必填，如无可为空")
    private String engName;

    @ApiModelProperty(value = "出生年月日，格式为: 2000-01-01")
    private Date birthday;

    @ApiModelProperty(value = "出生地")
    private String birthplace;

    @ApiModelProperty(value = "国籍")
    private String nationality;

    @ApiModelProperty(value = "证件类型")
    private String certType;

    @ApiModelProperty(value = "证件号码")
    private String certNumber;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "手机号码")
    private String mobilePhone;

    @ApiModelProperty(value = "家庭住址")
    private String address;

    @ApiModelProperty(value = "邮政编码")
    private String postcode;

    @ApiModelProperty(value = "所属机构")
    private String institution;

    @ApiModelProperty(value = "状态，0: 正常，1: 已注销")
    private Byte status;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNumber() {
        return certNumber;
    }

    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", engName=").append(engName);
        sb.append(", birthday=").append(birthday);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", nationality=").append(nationality);
        sb.append(", certType=").append(certType);
        sb.append(", certNumber=").append(certNumber);
        sb.append(", email=").append(email);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", address=").append(address);
        sb.append(", postcode=").append(postcode);
        sb.append(", institution=").append(institution);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}