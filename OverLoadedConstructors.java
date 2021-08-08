package com.lifelike.dev;

public class OverLoadedConstructors {

    public static void main(String[] args) {
//        overloaded constructors - multiple constructors in the same class with the same names
//                                  but different parameters

        Pizza firstPizza = new Pizza("thicc crust", "mozerrella",
                                    "tomato", "pepperroni");
        System.out.println();
        Pizza secondPizza = new Pizza("wheat rey", "cow curd",
                                    "apple");



    }
}

class Pizza {
    String bread, cheese, sauce, toppings;

    // constructor 1
    Pizza(String bread, String cheese, String sauce, String toppings) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;

        System.out.println("The ingredients of your ordered pizza are as follows: ");
        System.out.println(bread);
        System.out.println(cheese);
        System.out.println(sauce);
        System.out.println(toppings);
    }

    // constructor 2 - same name but different parameters as compared to constructor 1
    Pizza(String bread, String cheese, String sauce) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;

        System.out.println("The ingredients of your ordered pizza are as follows: ");
        System.out.println(bread);
        System.out.println(cheese);
        System.out.println(sauce);
    }
}
