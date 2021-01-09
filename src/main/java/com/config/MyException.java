package com.config;

public class MyException extends RuntimeException {
    private String msg;
    public MyException(String msg){
        super(msg);
    }
}
