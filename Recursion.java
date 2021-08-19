package com.lifelike.dev;

public class Recursion {

    public static void main(String[] args) {
        /*  Recursion  -  process of defining a thing in terms of that same thing.
                          in terms of functions and methods, it is the process where a function or method
                          calls itself.
                          often useful for advanced algorithm processes

                          Advantages
                            - short code
                            - easier to write

                          Disadvantages
                            - sometimes slower
                            - uses more memory
        * */

        firstRecursion(5);
        System.out.println();
        System.out.println(recursiveFactorial(7));
    }

    private static void firstRecursion(int iterations) {
        // recursive methods always have a base case
        // ie. a returning point where its processes come to an end and the method halts
        if (iterations < 1) return;

        System.out.println("Calling this method recursively " + iterations);

        firstRecursion(iterations - 1);
    }


    private static int recursiveFactorial(int number) {
        if (number < 1) return 1;

        return number * recursiveFactorial(number - 1);
    }
}
