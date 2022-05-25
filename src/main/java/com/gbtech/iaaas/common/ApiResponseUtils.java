package com.gbtech.iaaas.common;

import com.alibaba.fastjson.JSON;
import com.gbtech.iaaas.vo.ApiResponse;

import java.util.UUID;


public class ApiResponseUtils {

    /**
     * 接口统一返回（请求成功时）
     *
     * @param object 返回的数据对象
     * @return 序列化后的对象
     */
    public static String success(Object object) {
        ApiResponse apiResponse = new ApiResponse();
        UUID uuid = UUID.randomUUID();
        apiResponse.setCode(0);
        apiResponse.setMsg("success");
        apiResponse.setData(object);
        apiResponse.setRequestId(uuid.toString());
        System.out.println(JSON.toJSONString(apiResponse));
        return JSON.toJSONString(apiResponse);
    }

    /**
     * 接口统一返回（请求失败时）
     *
     * @param code 错误码
     * @param msg  错误信息
     * @return 序列化后的对象
     */
    public static String error(Integer code, String msg) {
        ApiResponse apiResponse = new ApiResponse();
        UUID uuid = UUID.randomUUID();
        apiResponse.setCode(code);
        apiResponse.setMsg(msg);
        apiResponse.setRequestId(uuid.toString());
        return JSON.toJSONString(apiResponse);
    }

}
