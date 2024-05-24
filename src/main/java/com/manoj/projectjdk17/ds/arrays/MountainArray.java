package com.manoj.projectjdk17.ds.arrays;

public class MountainArray {

    public static void main(String[] args) {

        int[] arr = {1, 5};
        System.out.println("isMountain:" + isMountain(arr));
        arr = new int[]{1, 5, 3};
        System.out.println("isMountain:" + isMountain(arr));
        arr = new int[]{1, 3, 5, 7, 8, 2};
        System.out.println("isMountain:" + isMountain(arr));

        arr = new int[]{1, 5, 3, 8, 7, 2};
        System.out.println("isMountain:" + isMountain(arr));

        System.out.println("With some input from internet");
        int[] arr1 = {0, 3, 2, 1};
        int[] arr2 = {2, 4, 5, 10, 9, 6};
        int[] arr3 = {2, 1};
        int[] arr4 = {1, 2, 3 , 4, 5 };

        System.out.println(isMountain(arr1)); // true
        System.out.println(isMountain(arr2)); // true
        System.out.println(isMountain(arr3)); // false
        System.out.println(isMountain(arr4)); // false

        System.out.println("With some input from internet using peak element");

        System.out.println(isMountainArray(arr1)); // true
        System.out.println(isMountainArray(arr2)); // true
        System.out.println(isMountainArray(arr3)); // false
        System.out.println(isMountainArray(arr4)); // false
    }

    private static boolean isMountain(int[] arr) {

        if(arr.length >= 3) {
            int increasingCount = 0;
            int decreasingCount = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] < arr[i+1]){
                    increasingCount = increasingCount + 1;
                }
                if(arr[i] > arr[i+1] && increasingCount > 0){
                    decreasingCount = decreasingCount + 1;
                }
            }

            if (increasingCount > 0  && decreasingCount > 0) {
                return true;
            }
        }

        return false;

    }

    private static boolean isMountainArray(int[] arr) {

        if(arr.length < 3) {
            return false;
        }

        int i = 0;
        while(i < arr.length - 1 && arr[i] < arr[i+1]) {
            i++;
        }
        if(i == 0 && i == arr.length - 1) {
            return false; // as there no increasing element, we cannot find the peak
        }
        int decrementingCount = 0;

        while(i < arr.length - 1 && arr[i] > arr[i+1]) {
            i++;
            decrementingCount++;
        }

        if(decrementingCount > 0){
            return true;
        }


        return false;

    }
}
