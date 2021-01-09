package com.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Data
@Component
@Order(11)
public class Dog {
    private String name="dog";
    @Autowired
    private Cat cat;
    public Dog(){
        System.out.println("dog");
    }

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put(null,"aa");
        map.put("a","bb");
        System.out.println(map.get(null));

    }
    /*public Dog(Cat cat){
        this.cat = cat;
    }*/

    /*public Dog(){
        this.name = "dog1";
    }*/
    /*public Dog(Cat cat){
        this.name = cat.getName();
    }*/
}
