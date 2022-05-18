package com.gbtech.iaaas.vo;

public class ApiResponse {

    private Integer code;
    private String msg;
    private Object data;
    private String requestId;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "ApiResponse{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + ", requestId='" + requestId + '\'' + '}';
    }
}
