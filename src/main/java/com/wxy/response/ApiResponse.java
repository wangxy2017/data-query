package com.wxy.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author wangxy
 * @Date 2019/6/17 11:16
 * @Description 响应实体类
 **/
@Data
@AllArgsConstructor
public class ApiResponse {

    private Integer code;
    private String msg;
    private Object data;

    private static final Integer SUCCESS_CODE = 1;
    private static final String SUCCESS_MSG = "SUCCESS";
    private static final Integer ERROR_CODE = -1;
    private static final String ERROR_MSG = "ERROR";

    public static ApiResponse success(Object data) {
        return new ApiResponse(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static ApiResponse error(Integer code, String msg, Object data){
        return new ApiResponse(code,msg,data);
    }
}

