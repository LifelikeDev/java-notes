package com.lifelike.dev;

public class ReturnCentury {

    public static void main(String[] args) {

        System.out.println(guessCentury(1705));
        System.out.println(guessCentury(1900));
        System.out.println(guessCentury(1601));
        System.out.println(guessCentury(1635));
        System.out.println(guessCentury(1699));
    }

    private static int guessCentury(int year) {

        return (int) Math.ceil( (double)year / 100 ) ;
    }
}
