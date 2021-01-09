package com.model;

import org.springframework.web.SpringServletContainerInitializer;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    private Cat.Amimal amimal ;
    public static void main(String[] args) {
        //ThreadLocal<String> local = new ThreadLocal<>();
        //SpringServletContainerInitializer springServletContainerInitializer;
        Set<String> singletonsCurrentlyInCreation =
                Collections.newSetFromMap(new ConcurrentHashMap<>(16));
        boolean a = singletonsCurrentlyInCreation.add("a");
        System.out.println(a);
        boolean a1 = singletonsCurrentlyInCreation.add("a");
        System.out.println(a1);


    }
}
