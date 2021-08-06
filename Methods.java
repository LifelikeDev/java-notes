package com.lifelike.dev;

public class Methods {

    public static void main (String[] args) {
        greeting("all");
        timeOfDay("Precious", "afternoon");
        System.out.println(multiply(45, 50));
    }

    static void greeting(String name) {
        System.out.println("Hello there, " + name);
    }

    static void timeOfDay(String name, String time) {
        greeting(name);
        System.out.println("Good " + time);
    }

    static int multiply(int first, int last) {
        return first * last;
    }
}
