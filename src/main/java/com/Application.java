package com;

import com.resource.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(Application.class,args);
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
    }
}
