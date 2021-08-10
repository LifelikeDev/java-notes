package com.lifelike.dev.interfaces;

public class Main {

    public static void main(String[] args) {
        /*  INTERFACES  -  templates that can be applied to classes
                           similar to inheritance; however, they specify what a class should
                           have or must do
                        -  more than one interface can be applied to a single class, whereas
                           inheritance is limited to a single direct super-class
                        -  a class using an interface must use the keyword "implements" in the
                           exact same manner as it would use "extends" with inheritance
                        -  methods in interfaces are called without an implementation (body),
                           and are overridden (defined with a body) in the implementing class
        */

        // classes implementing only a single interface
        Shark sharkOne = new Shark();
        Herrings herringOne = new Herrings();

        // class implementing more than a single interface
        Salmon salmonOne = new Salmon();

        sharkOne.feed();
        herringOne.flee();
        System.out.println();
        salmonOne.feed();
        salmonOne.flee();
    }
}
