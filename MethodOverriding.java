package com.lifelike.dev;

public class MethodOverriding {

    public static void main(String[] args) {
        /* method overriding -  the concept of declaring a method in a subclass which has been
                                already declared in a parent class, so that the child class can
                                have its own implementation of the method
         */

        Trucks truck = new Trucks();
        F150 fordF150 = new F150();
        Tacoma toyotaTacoma = new Tacoma();

        truck.engineSound();
        fordF150.engineSound();
        toyotaTacoma.engineSound();

    }
}

class Trucks {
    // overridden method
    void engineSound() {
        System.out.println("Vrooooom");
    }
}

class F150 extends Trucks {
    String name = "Ford F150";

    // overriding method
    @Override    // convention name - to let others know it is an overriding method
    void engineSound() {
        System.out.println("Vroooom Vroooom Vrooom");
    }
}

class Tacoma extends Trucks {
    String name = "Toyota Tacoma";
}