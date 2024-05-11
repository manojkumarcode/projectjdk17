package com.manoj.projectjdk17.ds.Arrays;

import io.cucumber.java.sl.In;

public class SmallestElementInArray {

    public static void main(String[] args) {
        int[] arr = {2,6,9,10,-11,0,5};
        findSmallestInArray(arr);
    }

    private static void findSmallestInArray(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < smallest){
                smallest = num;
            }
        }

        System.out.println("Smallest Element : " + smallest);
    }
}