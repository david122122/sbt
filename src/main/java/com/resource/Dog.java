package com.resource;

import lombok.Data;

@Data
public class Dog {
    private String name;
    private Cat cat;

    public Dog(){
        this.name = "a dog";
        System.out.println("dog init ...");
    }
}
