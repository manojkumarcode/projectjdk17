package com.manoj.projectjdk17.leetcode.twosum;

public class TwoSumProblem {

    public int[] twoSum_BruteForce(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for(int j= i+1 ; j < arr.length ; j++){
                if(target == arr[i] + arr[j]){
                    return new int[]{i, j};
                }
            }
        }


        return new int[]{0, 0};
    }


}
