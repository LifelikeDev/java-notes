package com.lifelike.dev;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main (String[] args) {
        // =++
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication Table Generator");
        System.out.println("Enter any number to generate a table for it: ");

        int number = scanner.nextInt();
        generateMultiplicationTable(number);
    }

    private static void generateMultiplicationTable(int number) {

        System.out.println("Good choice.");
        System.out.println("*** Generating your table in a bit ***");

        for (int a = 1; a <= 20; a++) {
            System.out.println(a + " x " + number + " = " + (a * number));
        }

        System.out.println("*** Table successfully generated ***");
    }


}
