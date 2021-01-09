package com.config;

import com.common.SimpleResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
public class GlobalExceptionHandler  {
    //@ExceptionHandler(value = MyException.class)
    public SimpleResponse myException(MyException ex){
        return new SimpleResponse(501,"内部异常",ex.getMessage());
    }

    //@ExceptionHandler(value = Exception.class)
    public SimpleResponse normalException(Exception ex){
        return new SimpleResponse(500,"出现异常",ex.getMessage());
    }

}
