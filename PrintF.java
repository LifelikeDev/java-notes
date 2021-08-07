package com.lifelike.dev;

public class PrintF {

    public static void main(String[] args) {

        /* printf() - print format -- optional method to format strings in the console window
                      receives two arguments - format string and an object/variable/value.
                      requires a format specifier, represented by %, which is then followed by:
                          - conversion character eg. %d, %s, %b, %f, %c, etc. or
                          - width character or
                          - precision character or
                          - flag
         */

        boolean myBool = true;
        char myChar = '#';
        int myInt = 34569887;
        double myDoub = 432.22344;
        String myStr = "Hey there...";

        // conversion characters
//        System.out.printf("%b \n", myBool);
//        System.out.printf("%c \n", myChar);
//        System.out.printf("%f \n", myDoub);
//        System.out.printf("%s \n", myStr);
//        System.out.printf("%d \n", myInt);

        // width - minimum number of characters to be written as output
        // sets the width (no.) of characters the variable/string is going to occupy
//        System.out.printf("What? %s \n", myStr);
//        System.out.printf("What? %1s \n", myStr);
//        System.out.printf("What? %8s \n", myStr);
//        System.out.printf("What? %14s \n", myStr);

        // precision
        // sets the number of digits of precision when outputting floating point values
//        System.out.printf("That figure is %f  \n", myDoub);
////        System.out.printf("That figure is %.0f  \n", myDoub);
////        System.out.printf("That figure is %.2f  \n", myDoub);
////        System.out.printf("That figure is %.4f  \n", myDoub);

        // flags
        // adds an effect to the output based on what flag was added to the format specifier
        float myFloat = 10005f;
        System.out.printf("This can be used for floats too, %f \n", myFloat);
        // left align figure with a width - %-
        System.out.printf("This can be used for floats too, %-20f \n", myFloat);
        // pad figure with zeros - %0
        System.out.printf("This can be used for floats too, %030f \n", myFloat);
        // format figures in currency format - %,
        System.out.printf("This can be used for floats too, %,f \n", myFloat);
    }
}
