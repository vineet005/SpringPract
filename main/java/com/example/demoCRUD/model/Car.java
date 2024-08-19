package com.example.demoCRUD.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    @Autowired
    public Car(Engine engine){
        this.engine = engine;
    }

    public void display(){
        System.out.println("Car with "+engine);
    }
}
