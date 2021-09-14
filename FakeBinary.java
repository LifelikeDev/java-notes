package com.lifelike.dev;

public class FakeBinary {

    /*  Given a string of digits, you should replace any digit below 5 with '0'
        and any digit 5 and above with '1'. Return the resulting string.
    */

    // Method One
    public static String fakeBinOne (String numberString) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            if ((int) numberString.charAt(i) < (int) '5') {
                newStr.append('0');
            }
            else {
                newStr.append('1');
            }
        }
        return newStr.toString();
    }

    // Method Two (Simpler and shorter)
    public static String fakeBinTwo (String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    public static void main(String[] args) {
        System.out.println(fakeBinOne("45385593107843568"));    // "01011110001100111"
    }
}
