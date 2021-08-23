package com.lifelike.dev;

public class InsertionSort {

    public static void main(String[] args) {

        /* Insertion Sort  -  algorithm that sorts by comparing elements to the left
                              shifts elements to the left to make room for insertion of the compared element

                              has a worst case scenario of O(n^2) [Quadratic]
                              has less steps than Bubble Sort

        */

//        int[] array = {2, 3, 5, 9, 1, 7, 8, 4, 6};
        int[] array = {82, 34, 56, 87, 22, 11, 4, 7, 13, 71, 40, 3};

        insertionSort(array);

        for(int element: array) {
            System.out.print(element + " ");
        }

    }

    private static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }
}
