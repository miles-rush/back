package com.base.back.hanlder;

import com.base.back.entity.ApiResponse;
import com.base.back.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public ApiResponse jsonErrorHandler(BaseException exception) {
        log.error("【BaseException】:{}", exception.getMessage());
        return ApiResponse.ofException(exception);
    }
}
