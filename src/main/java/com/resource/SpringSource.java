package com.resource;

import com.config.SpringConfig;
import com.config.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSource {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        House house = (House) applicationContext.getBean("house");
        System.out.println(house.getName());*/
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Work work = (Work) applicationContext.getBean("work");
        work.work();*/

        try{
            d1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void d1(){
        try{
            System.out.println("d1");
            int i = 1/0;
        }finally {
            System.out.println("finally...");
        }
    }
}
