package com.wxy.exception;

import com.wxy.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author wxy
 * @Date 19-7-1 下午1:55
 * @Description 全局异常处理
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler()
    @ResponseBody
    public ApiResponse exceptionHandle(Exception e) {
        log.error("查询异常：{}",e.getMessage());
        return ApiResponse.error(500,"查询异常",null);
    }
}
