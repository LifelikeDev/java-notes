package com.lifelike.dev;
import java.util.Scanner;

public class UserDefinedRandomer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a lower boundary: ");
        int lower = scanner.nextInt();

        System.out.println("Enter a upper boundary: ");
        int upper = scanner.nextInt();

        System.out.println(randomer(lower, upper));
    }

    private static int randomer(int lower, int upper) {

        int randomNumber = (int) ((Math.random() * upper) + lower);
//        int randomNumber = (int) (lower + (Math.random() * (upper - lower)) + lower);

        System.out.println("Generating a random number between " + lower + " and " + upper + "...");
        return randomNumber;
    }


}
