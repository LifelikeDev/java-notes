package com.lifelike.dev;

import java.util.Arrays;

public class RemoveFirstAndLastChars {

    public static void main (String[] args) {
        System.out.println(remove("extraordinary"));
        System.out.println(remove("stupendous"));

    }

    private static String remove (String str) {
        String newStr = "";
        String[] stringArray = str.split("");
        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < stringArray.length; i++) {

            if (i == 0 || i == stringArray.length - 1) {
                continue;
            }
            newStr += stringArray[i];
        }

        return newStr;
    }
}
