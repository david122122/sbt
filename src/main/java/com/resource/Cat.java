package com.resource;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

@Data
public class Cat implements InitializingBean {
    private String name;
    private Dog dog;
    public Cat(){
        System.out.println("cat init...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after ...");
    }
}
