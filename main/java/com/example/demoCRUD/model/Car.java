package com.example.demoCRUD.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Engine engine;

    public Car(){

    }

    public void display(){
        System.out.println("Car with "+engine);
    }
}
