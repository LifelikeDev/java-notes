package com.lifelike.dev;

public class CopyingObjects {

    public static void main(String[] args) {

        // TO COPY ONE OBJECT INTO ANOTHER,
        // 1. a copy method can be set up in the SaloonCar class, which can be used
        //      to copy the attributes of one car to another
        // 2. using method overriding, another SaloonCar constructor can be set up,
        //      where the copy method in the SaloonCar class is invoked to do the
        //      same thing

        SaloonCar saloonOne = new SaloonCar("Kia", "Optima", 2017);
//        SaloonCar saloonTwo = new SaloonCar("Hyundai", "Sonata", 2018);

        // METHOD ONE
//        saloonOne.copy(saloonTwo);

        // METHOD TWO
        SaloonCar saloonTwo = new SaloonCar(saloonOne);

        System.out.println(saloonOne);
        System.out.println(saloonTwo);
        System.out.println();
        System.out.println(saloonOne.getName());
        System.out.println(saloonOne.getModel());
        System.out.println(saloonOne.getYearOfMake());
        System.out.println();
        System.out.println(saloonTwo.getName());
        System.out.println(saloonTwo.getModel());
        System.out.println(saloonTwo.getYearOfMake());

    }
}


class SaloonCar {
    private String name;
    private String model;
    private int yearOfMake;

    SaloonCar(String name, String model, int yearOfMake) {
        this.setName(name);
        this.setModel(model);
        this.setYearOfMake(yearOfMake);
    }

    // METHOD 2: Setting up a copying constructor using method overriding
    SaloonCar(SaloonCar car) {
        this.copy(car);
    }

    // getting the values of the attributes
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    // setting the values of the attributes
    public void setName(String name) { this.name = name; };

    public void setModel(String model) { this.model = model; }

    public void setYearOfMake(int yearOfMake) { this.yearOfMake = yearOfMake; }

    // METHOD ONE: setting up a copy function(method)
    public void copy(SaloonCar car) {
        this.setName(car.getName());
        this.setModel(car.getModel());
        this.setYearOfMake(car.getYearOfMake());
    }


}