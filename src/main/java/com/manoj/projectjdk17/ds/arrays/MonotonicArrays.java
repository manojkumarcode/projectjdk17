package com.manoj.projectjdk17.ds.arrays;

public class MonotonicArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 5, 3, 2};
        isMonotonic(arr1);
        int[] arr2 = {1, 8, 15, 23, 32};
        isMonotonic(arr2);
        int[] arr3 = {1, 8, 15, 23, 3};
        isMonotonic(arr3);
        int[] arr4 = {10, 8, 7, 3, 1};
        isMonotonic(arr4);
    }

    private static void isMonotonic(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                increasing = false;
                break;
            }
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] < arr[i + 1]) {
                decreasing = false;
                break;
            }
        }

        if (increasing || decreasing) {
            printArray(arr);
            System.out.println("\nArray is Monotonic");
        } else {
            printArray(arr);
            System.out.println("\nArray is not Monotonic");
        }
    }

    static void printArray(int[] arr) {
        System.out.println();
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
