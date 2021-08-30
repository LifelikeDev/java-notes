package com.lifelike.dev;

public class InsertionSort {

    public static void main(String[] args) {

        /* Insertion Sort  -  algorithm that sorts by comparing elements to the left
                              shifts elements to the left to make room for insertion of the compared element

                              has a worst case scenario of O(n^2) [Quadratic]
                              has less steps than Bubble Sort

        */

//        int[] array = {2, 3, 5, 9, 1, 7, 8, 4, 6};
//        int[] array = {82, 34, 56, 87, 22, 11, 4, 7, 13, 71, 40, 3};
        int[] array = {5, 3, 9, 11, 2, 1, 8, 13, 20, 4};

        insertionSort(array);

        for (int element : array) {
            System.out.print(element + " ");
        }

    }

    private static void insertionSort(int[] array) {

        // iterations always begin at the index of 1, since it is always compared with the
        // previous element, ie. element at index of 0
        for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
            int temp = array[currentIndex];
            int previousIndex = currentIndex - 1;

            while (previousIndex >= 0 && array[previousIndex] > temp) {
                array[previousIndex + 1] = array[previousIndex];

                previousIndex--;
            }

            array[previousIndex + 1] = temp;
        }

    }


}
