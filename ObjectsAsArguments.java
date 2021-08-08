package com.lifelike.dev;

public class ObjectsAsArguments {

    public static void main(String[] args) {
        Van firstVan = new Van("Sienna");
        Van secondVan = new Van("Astra");
        Garage garage = new Garage();

        garage.start(firstVan);
        garage.drive(secondVan);
    }
}

// Garage class
class Garage {

    void start(Van van) {
        System.out.println("The " + van.name + " has been ignited.");
    }

    void drive(Van van) {
        System.out.println(van.name + " has just hit the roads.");
    }

}

// Van class
class Van {
    String name;

    Van(String name) {
        this.name = name;
    }
}
