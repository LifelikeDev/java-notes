package com.lifelike.dev.polymorphism;

public class Airplane extends Vehicle {

    public String name = "airplane";

    @Override
    public void drive() {
        System.out.println("The " + name + " has hit the road...");
    }

}
