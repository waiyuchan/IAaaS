package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class LocRegions implements Serializable {
    private Short id;

    @ApiModelProperty(value = "所属城市代码")
    private Short cityId;

    private String code;

    private String name;

    @ApiModelProperty(value = "名称")
    private String cname;

    private String lowerName;

    @ApiModelProperty(value = "地区代码")
    private String codeFull;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getCityId() {
        return cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getLowerName() {
        return lowerName;
    }

    public void setLowerName(String lowerName) {
        this.lowerName = lowerName;
    }

    public String getCodeFull() {
        return codeFull;
    }

    public void setCodeFull(String codeFull) {
        this.codeFull = codeFull;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cityId=").append(cityId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", cname=").append(cname);
        sb.append(", lowerName=").append(lowerName);
        sb.append(", codeFull=").append(codeFull);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}