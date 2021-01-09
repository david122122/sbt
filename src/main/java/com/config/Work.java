package com.config;

import org.springframework.stereotype.Component;

@Component
public class Work {
    public void work(){
        System.out.println("work ....");
        int i = 1/0;
    }
}
