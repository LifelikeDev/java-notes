package com.lifelike.dev;

public class BinarySearch {

    public static void main(String[] args) {

        int[] someArr = {5, 10, 15, 20, 25, 30, 35};
        System.out.println(searchAgain(someArr, 30));
    }

    public static int search(int[] arr, int target) {
        int startPoint = 0;
        int endPoint = arr.length - 1;
        int mid = startPoint + ((endPoint - startPoint) / 2);
        int index = -1;

        while(startPoint <= endPoint) {
            System.out.println("method running");
            if(arr[mid] < target) {
                startPoint = mid + 1;
            } else if (arr[mid] == target) {
                index = mid;
                System.out.println("Number found at position " + index);
                break;
            } else {
                endPoint = mid - 1;
            }

            mid = startPoint + ((endPoint - startPoint) / 2);
        }

        if (index == -1)
            System.out.println("Number not found");

        return index;

    }

    public static int searchAgain(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
//        int mid = low + ((high - low) / 2);
        int mid = (low + high) >>> 1;
        int midValue = arr[mid];


        while (low <= high) {
            System.out.println("Search in progress...");

            if (midValue == target) {
                System.out.println("Number found at index " + mid);
                return mid;
            } else if (midValue > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Number not found");
        return -1;
    }

}
