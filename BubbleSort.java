package com.lifelike.dev;

public class BubbleSort {

    public static void main(String[] args) {

        /* Bubble Sort  -  sorts by comparing adjacent elements
                           if the previous element is greater than the current element, it swaps the two elements
                           such as the smallest element comes first before the greatest

                           though simple, it is an inefficient algorithm for large data sets
                           has a time complexity of O(n^2) [Quadratic]
         */

        int[] array = {9, 5, 2, 6, 1, 7, 4, 5, 11, 13, 3, 8, 10};

        bubbleSort(array);

        for (int element : array) {
            System.out.print(element + " ");
        }

    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

    }
}
