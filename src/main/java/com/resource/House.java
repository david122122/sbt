package com.resource;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

@Data
public class House implements InitializingBean {
    private String name;

    public House(){
        System.out.println("init ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "horse";
    }
}
