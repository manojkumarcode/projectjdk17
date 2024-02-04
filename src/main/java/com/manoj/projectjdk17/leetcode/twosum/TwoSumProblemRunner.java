package com.manoj.projectjdk17.leetcode.twosum;

import java.util.Arrays;

public class TwoSumProblemRunner {


    public static void main(String[] args) {
        TwoSumProblem obj = new TwoSumProblem();
        int[] indices = obj.twoSum_BruteForce(new int[]{2,7,11,15} , 9 );
        Arrays.stream(indices).forEach(element -> System.out.print(element + " "));
        System.out.println("");

        indices = obj.twoSum_BruteForce(new int[]{3,2,4} , 6 );
        Arrays.stream(indices).forEach(element -> System.out.print(element + " "));
        System.out.println("");

        indices = obj.twoSum_BruteForce(new int[]{3,3} , 6 );
        Arrays.stream(indices).forEach(element -> System.out.print(element + " "));
    }
}
