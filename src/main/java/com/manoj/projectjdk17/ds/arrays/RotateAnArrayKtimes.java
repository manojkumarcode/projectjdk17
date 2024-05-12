package com.manoj.projectjdk17.ds.arrays;

public class RotateAnArrayKtimes {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int k = 1;
        System.out.println("Rotate when k = 1");
        printArray(arr);
        rotateKTimes(arr, k);
        System.out.println("\nRotate when k = 2");
        arr = new int[] {1, 3, 5, 7, 9};
        printArray(arr);
        rotateKTimes(arr, 2);
    }

    private static void rotateKTimes(int[] arr, int k) {
        reverse(arr,0, arr.length - k);
        printArray(arr);
        reverse(arr,arr.length - k, arr.length );
        printArray(arr);
        reverse(arr);
        printArray(arr);
    }

    public static void reverse(int[] arr, int start, int end) {
        int j = end - 1;
        for (int i = start; i < j; i++) {
            if (i != j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j--;
        }
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

    static void printArray(int[] arr) {
        System.out.println();
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
