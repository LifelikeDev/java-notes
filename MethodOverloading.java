package com.lifelike.dev;

public class MethodOverloading {

    public static void main(String[] args) {
        /*=
        overloaded methods are methods that have the share the same name but have
        different parameters passed in them
        Each method has its own unique method signature, which a method's name plus
        its parameters
        */

        System.out.println(add(1,2,3));
        System.out.println(add(1,7));
        System.out.println(add(4, 5, 6, 9));
        System.out.println(add(4.309332, 1.224));

    }

    static int add(int a, int b) {
        System.out.println("Overloaded method no.1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overloaded method no.2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overloaded method no.3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("Overloaded method no.4");
        return a + b;
    }

    static short add(short b, short c, short d) {
        System.out.println("Overloaded method no.5");
        return (short)(b + c + d);
    }
}
