package com.lifelike.dev.polymorphism;

public class Main {

    public static void main(String[] args) {

        /* POLYMORPHISM  -  more than one or many forms.
                            the ability of an object to identify as more than one (data) type
        */

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Airplane airplane = new Airplane();


        /* It's possible to store the Car, Bicycle and Airplane objects in the
            vehicles array since they are all of the same type - Vehicle
            eg. car is of the object (type) Car, and also Vehicle
        */
        Vehicle[] vehicles = { car, bicycle, airplane };

        for (Vehicle vehicle: vehicles) {
            vehicle.drive();
        }

    }
}
