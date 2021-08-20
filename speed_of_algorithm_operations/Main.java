package com.lifelike.dev.speed_of_algorithm_operations;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();  // NB: doubly linked list here

        // populating both lists with random values
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // defining speed parameters
        long startTime;
        long endTime;
        long elapsedTime;

        // ArrayList Operation
        startTime = System.nanoTime();

//        arrayList.get(0); // 35100 ns
//        arrayList.get(500); // 35300 ns
//        arrayList.get(500000); // 46500 ns
//        arrayList.get(999999); // 35000 ns
//        arrayList.remove(0); // 10395600 ns
//        arrayList.remove(500000); // 4990800 ns
        arrayList.remove(999999); // 70000 ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ArrayList Operation: " + elapsedTime + " nanoseconds");

        // LinkedList Operation
        startTime = System.nanoTime();

//        linkedList.get(0); // 42900 ns
//        linkedList.get(500); // 71700 ns
//        linkedList.get(500000); // 24070400 ns
//        linkedList.get(999999); // 37500 ns
//        linkedList.remove(0); // 46500 ns
//        linkedList.remove(500000); // 25134700 ns
        linkedList.remove(999999); // 46600 ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList Operation: " + elapsedTime + " nanoseconds");
    }

}
