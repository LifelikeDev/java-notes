package com.lifelike.dev.dynamicPolymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*  DYNAMIC POLYMORPHISM  -  the ability of an object to take up many forms after
                                     compilation or during runtime (when the program is running)
        */
        Scanner scanner = new Scanner(System.in);
        SmartPhone yourPhone;

        System.out.println("Choose one smartphone. Press enter to continue");
        System.out.print("1: iPhone || 2: Samsung ");
        byte userChoice = scanner.nextByte();

        if (userChoice == 1) {
            yourPhone = new iPhone();
            yourPhone.describe();
        } else if (userChoice == 2) {
            yourPhone = new Samsung();
            yourPhone.describe();
        } else {
            yourPhone = new SmartPhone();
            yourPhone.describe();
            System.out.println("Invalid choice. Please try again");
            scanner.close();
        }

        scanner.close();


    }
}
