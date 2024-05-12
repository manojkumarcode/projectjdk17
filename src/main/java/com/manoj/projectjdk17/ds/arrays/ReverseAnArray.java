package com.manoj.projectjdk17.ds.arrays;

import static com.manoj.projectjdk17.ds.arrays.ArrayUtils.printArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 8, 5, 3, 2};
        int[] arr2 = {7, 8, 3, 5, 2, 1};
        printArray(arr1);
        reverse(arr1);
        printArray(arr1);
        printArray(arr2);
        reverse(arr2);
        printArray(arr2);

    }

    public static void reverse(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < j; i++) {
            if (i != j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j--;
        }
    }
}
