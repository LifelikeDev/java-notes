package com.lifelike.dev;

public class Car {

    String make = "Dodge";
    String model = "Charger";
    int yearOfMake = 2019;
    double price = 100000.00;
    String color = "blue";
    boolean hasTurbo = true;

    void start() {
        System.out.println("The engines are cranked up.");
    }

    void park() {
        System.out.println("The brakes have been hit and we are at rest.");
    }

    static void drive() {
        System.out.println("Let's hit the road... Vroooooom!!!");
    }
}
