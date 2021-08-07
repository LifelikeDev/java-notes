package com.lifelike.dev;

public class UseOfConstructors {

    public static void main(String[] args) {
        Human firstMan = new Human("John Doe", 35, 67.2);
        Human firstWoman = new Human("Jane Wallace", 23, 48.3);

        // accessing object's methods with constructor
        firstMan.favouriteNumber();
        firstWoman.favouriteNumber();
        firstWoman.greet("afternoon");

        // accessing object's variables with constructor
//        System.out.println("firstMan's name is " + firstMan.name);
//        System.out.println("firstMan's age is " + firstMan.age);
//        System.out.println("firstMan's weight is " + firstMan.weight + " kg");
//        System.out.println();
//        System.out.println("firstWoman's name is " + firstWoman.name);
//        System.out.println("firstWoman's age is " + firstWoman.age);
//        System.out.println("firstWoman's weight is " + firstWoman.weight + " kg");
    }
}

// Human class called defined beneath instead of in a separate file
// Note how the "public" keyword isn't being attached to the name of the class
class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight ;
    }

    void favouriteNumber() {
        System.out.println(this.name + "'s favourite number is " + this.age);
    }

    void greet(String greeting) {
        System.out.println(this.name + " greets you: Good " + greeting + "!");
    }
}
