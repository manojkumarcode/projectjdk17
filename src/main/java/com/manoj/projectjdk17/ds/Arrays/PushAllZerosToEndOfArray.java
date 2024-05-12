package com.manoj.projectjdk17.ds.Arrays;

public class PushAllZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 0, 8, 9, 0, 3, 0, 2};
        pushZeroToEnd(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void pushZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

}
