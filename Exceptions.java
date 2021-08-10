package com.lifelike.dev;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        /*  EXCEPTION  -  an event that disrupts the normal flow of instructions during
                          the execution of a program
                          unexpected event that occurs and stops a program
                          use TRY - CATCH blocks to handle exceptions
        */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Let's perform a division of numbers exercise");
            System.out.println("Enter a numerator");
            int numerator = scanner.nextInt();
            System.out.println("Enter a denominator");
            int denominator = scanner.nextInt();

            float result = (float) numerator / (float) denominator;
            System.out.println("The result is " + result);
        }
        // suppose a user enters 0 as a denominator, it will throw an exception
        catch (ArithmeticException error) {
            System.out.println("You can't divide by zero");
        }
        // suppose a user enters a string as any of the input values,
        // an exception will be thrown
        catch (InputMismatchException error) {
            System.out.println("You can't perform division with words/letters");
        }
        // use the finally block to execute a code that will run regardless
        // of the exception or success of the program
        finally {
            System.out.println("Division exercise ended!");
            scanner.close();
        }
    }
}
