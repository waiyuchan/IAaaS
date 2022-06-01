package com.gbtech.iaaas.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AeStaffPermission implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "父级权限id")
    private Integer pid;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "权限值")
    private String value;

    @ApiModelProperty(value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    @ApiModelProperty(value = "前端资源路径")
    private String uri;

    @ApiModelProperty(value = "启用状态；0->禁用；1->启用")
    private Integer status;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", type=").append(type);
        sb.append(", uri=").append(uri);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}