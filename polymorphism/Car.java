package com.lifelike.dev.polymorphism;

public class Car extends Vehicle {

    public String name = "car";

    @Override
    public void drive() {
        System.out.println("The " + name + " has hit the road...");
    }

}
