package com.lifelike.dev.polymorphism;

public class Bicycle extends Vehicle {

    public String name = "bicycle";

    @Override
    public void drive() {
        System.out.println("The " + name + " has hit the road...");
    }

}
