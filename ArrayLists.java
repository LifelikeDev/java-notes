package com.lifelike.dev;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        // ArrayList - Dynamic (Resizable) arrays in Java
        //             Are such that elements can be added or removed even after
        //             compilation
        //             ArrayLists only store reference types. To store primitive types,
        //             use wrapper classes

        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        // adding elements to the array
        cars.add("Bugatti");
        cars.add("Lamborghini");
        cars.add("Ferrari");
        cars.add("Challenger");
        cars.add("Bentley");

        scores.add(2201);
        scores.add(40);
        scores.add(6391);
        scores.add(563);

        // removing elements from the array
        cars.remove(2);
        scores.remove(3);

        // setting elements at different indexes
        cars.set(2, "F150");
        cars.set(3, "Mustang");
        scores.set(0, 3);
        scores.set(2, 121);

        // clear elements in the array
        // cars.clear();

        // for loop
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }

        // for each loop
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
