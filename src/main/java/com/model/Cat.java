package com.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Data
@Order(10)
public class Cat {
    private String name="cat";
    @Autowired
    private Dog dog;
    public String age;
    public Cat(){
        System.out.println("cat");
    }
    //@Autowired
    //private MaleCat maleCat;

    /*public Cat(MaleCat maleCat){
        this.maleCat= maleCat;
    }*/

   /* public Cat(Dog dog){
        this.dog = dog;
    }*/
    /*public Cat(){
        this.name = "cat1";
    }*/

    @Data
    class Amimal{
        private String aName;

    }
}
