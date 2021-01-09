package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api")
public class SimpleController {
    public SimpleController(){
        System.out.println("init simpleController....");
    }

    @RequestMapping(value = "test")
    @ResponseBody
    public String test(){
        return "aa";
    }
}
