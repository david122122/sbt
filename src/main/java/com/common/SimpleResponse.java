package com.common;

import lombok.Data;

@Data
public class SimpleResponse {
    private int code;
    private String msg;
    private Object data;

    public SimpleResponse(){
        this.code = 200;
        this.msg = "操作成功";
    }

    public SimpleResponse(Object data){
        this();
        this.data = data;
    }

    public SimpleResponse(int code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
