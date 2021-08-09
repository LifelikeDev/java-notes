package com.lifelike.dev;

public class SuperKeyword {

    public static void main(String[] args) {

        // super keyword - refers to the super-class or the parent class of a class (subclass)

        Nissan pathfinder = new Nissan("Pathfinder", 2009, "blue");
        Toyota sequoia = new Toyota("Sequoia", 2019, 12000.00);

//        System.out.println(pathfinder.name);
//        System.out.println(pathfinder.makeYear);
//        System.out.println(pathfinder.color);
//        System.out.println();
//        System.out.println(sequoia.name);
//        System.out.println(sequoia.makeYear);
//        System.out.println(sequoia.mileage);

        System.out.println(pathfinder.describeVehicle());
        System.out.println(sequoia.describe());
        System.out.println(sequoia.describeVehicle());

    }
}

class SUV {
    String name;
    int makeYear;

    SUV(String name, int makeYear) {
        this.name = name;
        this.makeYear = makeYear;
    }

    public String describe() {
        return this.name + "-" + this.makeYear + "-";
    }

}

class Nissan extends SUV {
    String color;

    Nissan(String name, int makeYear, String color) {
        super(name, makeYear);
        this.color = color;
    }

    // inheriting a method in the super-class
    String describeVehicle() {
        return super.describe() + this.color;

    }
}

class Toyota extends SUV {
    double mileage;

    Toyota(String name, int makeYear, double mileage) {
        super(name, makeYear);
        this.mileage = mileage;
    }

    String describeVehicle() {
        return super.describe() + this.mileage;
    }

}
