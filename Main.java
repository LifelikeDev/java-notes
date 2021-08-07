package com.lifelike.dev;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();
        Car secondCar = new Car();

        newCar.start();
        newCar.park();

        System.out.println("This is a " + newCar.make + " " +
                            newCar.model + " made in " + newCar.yearOfMake
                          );
        System.out.println("This " + newCar.color + " version is sold for $" + newCar.price);

        System.out.println();

        secondCar.make = "Toyota";
        secondCar.model = "4Runner";
        secondCar.yearOfMake = 2018;
        secondCar.price = 85000.00;

        System.out.println("This is a " + secondCar.make + " " +
                            secondCar.model + " made in " + secondCar.yearOfMake
                          );
        System.out.println("This " + secondCar.color + " version is sold for $" + secondCar.price);


    }
}
