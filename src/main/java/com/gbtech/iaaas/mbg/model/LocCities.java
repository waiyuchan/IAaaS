package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class LocCities implements Serializable {
    private Short id;

    @ApiModelProperty(value = "所属州省代码")
    private Short stateId;

    private String code;

    private String name;

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

    public Short getStateId() {
        return stateId;
    }

    public void setStateId(Short stateId) {
        this.stateId = stateId;
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
        sb.append(", stateId=").append(stateId);
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