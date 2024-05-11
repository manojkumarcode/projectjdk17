package com.manoj.projectjdk17.ds.hashing;

import java.util.HashMap;

public class MostFrequentElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,8,9,2,2,3,100,1,2,1,1,99};
        int element = Integer.MIN_VALUE;
        int frequency = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num : arr){
            int count = hashMap.getOrDefault(num, 0);
            hashMap.put(num, ++count);
            if(count > frequency){
                frequency = count;
                element = num;
                System.out.println("Element:" + element + ", frequency:" + frequency);
            }
        }
    }
}
