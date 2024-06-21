package com.manoj.projectjdk17.leetcode.twosum;

import java.util.HashMap;

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


    public int[] two_pass_hash_table_approach(int[] arr, int target){

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        System.out.print("The index are : ");

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                int j = map.get(complement);
                return new int[] {i,j};
            }
        }
        return new int[]{0, 0};
    }


}
