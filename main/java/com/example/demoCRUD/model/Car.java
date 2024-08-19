package com.example.demoCRUD.model;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void display(){
        System.out.println("Car with "+engine);
    }
}
