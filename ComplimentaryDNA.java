package com.lifelike.dev.codewars_exercises;

import java.util.Arrays;

public class ComplimentaryDNA {

    public static void main (String[] args) {

        System.out.println(makeCompliment("ATTGC"));
        System.out.println(makeCompliment("GTAT"));

    }

    private static String makeCompliment(String sequence) {
        String[] sequenceArray = sequence.split("");

        String newSequence = "";

        for (String word: sequenceArray) {
            if ("A".equals(word)) {
                word = word.replace(word, "T");
            } else if ("T".equals(word)) {
                word = word.replace(word, "A");
            } else if ("G".equals(word)) {
                word = word.replace(word, "C");
            } else {
                word = word.replace(word, "G");
            }

            newSequence += word;
        }

        return newSequence;

    }
}
