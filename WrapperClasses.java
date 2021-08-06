package com.lifelike.dev;

public class WrapperClasses {

    public static void main(String[] args) {
        // Wrapper classes provide a way to use primitive data types as reference data types
        // ex. include Boolean, Character, String, Integer, Double, Float, etc. (first letters
        //     capitalized)
        // REFERENCE DATA TYPES have the advantage of possessing useful methods unlike primitive
        // types which lack methods

        // Some important concepts to be aware of
        // AUTOBOXING - the automatic conversion that the Java compiler makes between the
        //              primitive types and their corresponding object wrapper classes
        // UNBOXING - the automatic conversion of wrapper classes to primitive types
        //            the reverse of autoboxing;

        // AUTOBOXING EXAMPLES
        Boolean a = true;
        Character b = '*';
        Integer c = 2345;
        Double d = 456.788;
        String e = "Hello there";

//        System.out.println(d.toString());
//        System.out.println(e.length());
//        System.out.println(b.equals('$'));

        // UNBOXING EXAMPLES
        // treated as though they were primitive types
        if (a) {
            System.out.println("This exists...");
        }

        if (d == 456.788)
            System.out.println("This is a double");
        else
            System.out.println("Must be another data type");
    }
}
