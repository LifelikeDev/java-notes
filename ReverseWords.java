package com.lifelike.dev;

public class ReverseWords {

    public static void main (String[] args) {

        String sentenceOne = "Hello there! You must be champ.";
        String sentenceTwo = "All  hail! the power, of  Jesu's  name";

        System.out.println(reverse(sentenceOne));
        System.out.println(reverse(sentenceTwo));

    }

    private static String reverse (String words) {

        String[] splitWords = words.split(" ");
        String[] reversedArray = new String[splitWords.length];
        String reversedString = "";

        for (int i = splitWords.length - 1; i >= 0; ) {
            for (int j = 0; j < reversedArray.length; ) {
                reversedArray[j] = splitWords[i];

                j++;
                i--;
            }
        }

        int a = 0;
        while (a < reversedArray.length) {
            reversedString += reversedArray[a] + " ";

            a++;
        }

        return reversedString.trim();
    }

}
