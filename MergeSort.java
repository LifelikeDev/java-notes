package com.lifelike.dev;

public class MergeSort {

    public static void main(String[] args) {
        /*  Merge Sort  -  a divide and conquer algorithm
                           sorts out an array through subsequent halving of arrays into sub-arrays,
                           then sorts,
                           then merges back into one main array
                           employs recursion to achieve this

                           Time complexity  - O(n log n) [Quasilinear]
                           Space complexity - O(n) [Linear]
        */

//        int[] inputArray = {2, 4, 8, 9, 2, 4, 1, 6, 9};
        int[] inputArray = {20, 34, 54, 12, 8, 15, 17, 85, 23};

        mergeSort(inputArray);

        for(int item: inputArray) {
            System.out.print(item + " ");
        }

    }

    private static void mergeSort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength <= 1) return;

        int arrMidpoint = arrayLength / 2;
        int[] leftSubArray = new int[arrMidpoint];
        int[] rightSubArray = new int[arrayLength - arrMidpoint];

        int i = 0;
        int j = 0;

        // populating the left and right sub-arrays with elements from the parent array
        for (; i < arrayLength; i++) {
            if (i < arrMidpoint) {
                leftSubArray[i] = array[i];
            } else {
                rightSubArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftSubArray);
        mergeSort(rightSubArray);
        merge(leftSubArray, rightSubArray, array);
    }

    // merging into a single return array
    private static void merge(int[] leftSubArray, int[] rightSubArray, int[] array) {

        int leftArraySize = array.length / 2;
        int rightArraySize = array.length - leftArraySize;

        // three indices for control flow
        int i = 0; // for the parent array
        int l = 0; // for the left sub-array
        int r = 0; // for the right sub-array

        while (l < leftArraySize && r < rightArraySize) {
            if (leftSubArray[l] < rightSubArray[r]) {
                array[i] = leftSubArray[l];
                i++;
                l++;
            } else {
                array[i] = rightSubArray[r];
                i++;
                r++;
            }
        }

        while (l < leftArraySize) {
            array[i] = leftSubArray[l];
            i++;
            l++;
        }

        while (r < rightArraySize) {
            array[i] = rightSubArray[r];
            i++;
            r++;
        }

    }
}
