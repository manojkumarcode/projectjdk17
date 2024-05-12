package com.manoj.projectjdk17.ds.arrays;

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

    private static void printArray(int[] arr) {
        System.out.println();
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    private static void reverse(int[] arr) {
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
