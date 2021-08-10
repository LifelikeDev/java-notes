package com.lifelike.dev.interfaces;

/*  Class implementing more than one interface  */

public class Salmon implements Predator, Prey {

    @Override
    public void flee() {
        System.out.println("Bossman's after me!!! Gotta fleee...");
    }

    @Override
    public void feed() {
        System.out.println("I'm the boss today. I gotta feed...");
    }
}
