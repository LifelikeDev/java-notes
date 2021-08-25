package com.lifelike.dev.codewars_exercises;

public class ValidateRegexPin {

    public static void main(String[] args) {

        // valid pin should be 4-digit or 6-digit; nothing else.

        System.out.println(validatePin("1234"));
        System.out.println(validatePin("0000"));
        System.out.println(validatePin("1234567"));
        System.out.println(validatePin("112-"));
        System.out.println(validatePin("199034"));
        System.out.println(validatePin(".234"));
        System.out.println(validatePin("923 "));

        String rand = "9234 ";
        System.out.println(rand.trim().length());

    }

    private static boolean validatePin(String pin) {
//        boolean response = true;
//        char[] newPin = pin.trim().toCharArray();
//
//        for (char item: newPin) {
//
//            if (newPin.length == 4 || newPin.length == 6 ) {
//                String stringItem = Character.toString(item);
//
//                if(stringItem.matches("[^0-9]")) {
//                    response = false;
//                    break;
//                } else {
//                    response = true;
//                }
//            }
//            else {
//                response = false;
//            }
//        }
//
//        return response;


        if (pin.matches("\\d{4}|\\d{6}")) {
            return true;
        }
        return false;
    }


}
