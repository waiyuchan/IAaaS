package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class LocCountries implements Serializable {
    private Short id;

    private Integer continentId;

    @ApiModelProperty(value = "地区代码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    private String fullName;

    private String cname;

    private String fullCname;

    private String lowerName;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getContinentId() {
        return continentId;
    }

    public void setContinentId(Integer continentId) {
        this.continentId = continentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getFullCname() {
        return fullCname;
    }

    public void setFullCname(String fullCname) {
        this.fullCname = fullCname;
    }

    public String getLowerName() {
        return lowerName;
    }

    public void setLowerName(String lowerName) {
        this.lowerName = lowerName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", continentId=").append(continentId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", fullName=").append(fullName);
        sb.append(", cname=").append(cname);
        sb.append(", fullCname=").append(fullCname);
        sb.append(", lowerName=").append(lowerName);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}