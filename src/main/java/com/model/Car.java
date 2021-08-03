package com.model;

import lombok.Data;

@Data
public class Car {
    private String name;
    private Long[] num;

    public Car(String name,Long[] num){
        this.name = name;
        this.num = num;
    }
}
