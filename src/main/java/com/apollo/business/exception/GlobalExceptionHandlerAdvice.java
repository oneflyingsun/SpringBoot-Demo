package com.apollo.business.exception;


import com.apollo.business.constant.Code;
import com.apollo.business.response.BaseResult;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 *
 * 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {
    private static final Logger logger = Logger.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler(TokenException.class)
    @ResponseBody
    public BaseResult handleTokenException(TokenException e) {
        logger.error(e);
        e.printStackTrace();
        return new BaseResult(Code.TOKEN_CRYPT_ERROR.getCode(), e.getMessage());
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResult handleDefaultException(Exception be) {
        logger.error(be);
        be.printStackTrace();
        return new BaseResult(Code.UNKNOWN_ABNORMAL.getCode(), Code.UNKNOWN_ABNORMAL.getMsg(), be.getMessage());
    }


}
