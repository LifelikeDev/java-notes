package com.lifelike.dev.codewars_exercises;

public class ReduceButGrow {

//            Given a non-empty array of integers, return the result of multiplying the
//            values together in order. Example:
//            [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

    public static int grow(int[] arr){
        int result = 1;
        for (int item : arr) {
            result *= item;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] someArr = {2, 4, 6, 8, 9, 12, 15};
        System.out.println(grow(someArr));
    }
}
