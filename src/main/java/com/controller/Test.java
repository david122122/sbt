package com.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class Test {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        RequestMappingHandlerMapping requestMappingHandlerMapping;
        RequestMappingHandlerAdapter requestMappingHandlerAdapter;
        WebMvcAutoConfiguration webMvcAutoConfiguration;
    }
}
