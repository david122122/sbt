package com.controller;

import com.MyJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestJsonController {

    public TestJsonController(){
        System.out.println("TestJsonController init...");
    }
    @Autowired
    private MyJsonService myJsonService;

    @RequestMapping(value = "/testMyJson")
    public String testMyJson(){
        List list = new ArrayList();
        list.add("zhangsan");
        list.add("||lisi");
        return myJsonService.toMyJsonStr(list);
    }

    public void testA(){

    }

    public void testB(){

    }

    public void testC(){

    }
}
