package com.lifelike.dev;
// import java.util.Arrays;
// import static java.util.Arrays.binarySearch;

public class BinarySearchTwo {

    public static void main(String[] args) {

//       int[] array = new int[50];
       int[] array = new int[500];
       int target = -2;

       for(int i = 0; i < array.length; i++) {
           array[i] = i;
       }

       // using the built-in binary search method
//       int index = Arrays.binarySearch(array, target);
//
        // creating a custom binary search method
        int index = customBinarySearch(array, target);

       if (index == -1 )
           System.out.println(target + " not found");
       else
           System.out.println("Target found at index: " + index);

    }

    private static int customBinarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;
        int iterations = 0;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            int value = array[mid];

            System.out.println("middle value: " + value);
            System.out.println("No. of iterations:" + iterations);

            if (value < target) {
                first = mid + 1;
            } else if (value > target) {
                last = mid - 1;
            } else {
                return mid;
            }

            iterations++;
        }

        return - 1;
    }

}
