package com.lifelike.dev;

public class Encapsulation {

    public static void main(String[] args) {

       /* Encapsulation  -  attributes of a class are hidden or private
                            can be accessed only through methods such as getters
                            and setters
                            attributes should be made private if there are no intentions
                            to make them public                */

       Vehicle vehicleOne = new Vehicle("Hyundai", "Accent", 2018);
       // attributes of vehicleOne are not accessible since they are all private
//       System.out.println(vehicleOne.name);

       System.out.println(vehicleOne.getName());
       System.out.println(vehicleOne.getModel());
       System.out.println(vehicleOne.getYearOfMake());

       // altering private attributes
        vehicleOne.setName("Honda");
        vehicleOne.setModel("Accord");
        vehicleOne.setYearOfMake(2020);

        System.out.println(vehicleOne.getName());
        System.out.println(vehicleOne.getModel());
        System.out.println(vehicleOne.getYearOfMake());


    }
}

class Vehicle {
    private String name;
    private String model;
    private int yearOfMake;

    Vehicle(String name, String model, int yearOfMake) {
//        this.name = name;
//        this.model = model;
//        this.yearOfMake = yearOfMake;
        this.setModel(name);
        this.setModel(model);
        this.setYearOfMake(yearOfMake);
    }

    // private attributes however can be accessed by using getters
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    // private attributes can be altered or changed using setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
}
