package com.manoj.projectjdk17.ds.hashing;

import java.util.HashSet;

public class FirstNonRepeatingElement {

    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 3, 4, 10, 5, 6};
        int firstNonRepeatingElement = Integer.MIN_VALUE;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (hashSet.add(arr[i])) {
                firstNonRepeatingElement = arr[i];
            }
        }
        System.out.println("firstNonRepeatingElement: " + firstNonRepeatingElement);
    }
}
