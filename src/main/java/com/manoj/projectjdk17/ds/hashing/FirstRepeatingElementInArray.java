package com.manoj.projectjdk17.ds.hashing;

import java.util.HashSet;

public class FirstRepeatingElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        findFirstRepeatingElement(arr);
        int[] arr2 = {1, 10, 5, 3, 1, 4, 3, 15, 6, 4, 5, 1};
        findFirstRepeatingElement(arr2);
    }

    private static void findFirstRepeatingElement(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int firstRepeatingElement = Integer.MIN_VALUE;
        for (int num : arr) {
            if (!hashSet.add(num)) {
                firstRepeatingElement = num;
            }
        }
        System.out.println("firstRepeatingElement: " + firstRepeatingElement);
    }
}
