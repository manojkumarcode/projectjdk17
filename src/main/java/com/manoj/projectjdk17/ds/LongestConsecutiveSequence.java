package com.manoj.projectjdk17.ds;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 8, 10, 3};
        System.out.println("Length of longest consecutive sequence is " + findConsecutiveSequence(arr));
    }

    public static int findConsecutiveSequence(int[] arr) {
        if (arr == null && arr.length == 0) {
            return 0;
        }
        HashSet<Integer> numHashSet = new HashSet<>();

        for (int num : arr) {
            numHashSet.add(num);
        }
        int longestStreak = 0;

        for (int num : numHashSet) {
            while (!numHashSet.contains(num - 1)) // only start counting if num is the start of sequence
            {
                int currentNum = num;
                int currentSteak = 1;
                while (numHashSet.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    currentSteak = currentSteak + 1;
                }

                longestStreak = Math.max(currentNum, longestStreak);
            }
        }

        return longestStreak;
    }


}
