package com.manoj.projectjdk17.ds.hashing;

import java.util.HashSet;

public class OneArrayIsSubsetOfAnother {

    public static void main(String[] args) {
        int[] arr1 = {5,2,4,1,3};
        int[] arr2 = {1,5,2};

        System.out.println("isSubset:" + isSubset(arr1, arr2));

        int[] arr3 = {1,5,2,7};

        System.out.println("isSubset:" + isSubset(arr1, arr3));
    }

    public static boolean isSubset(int[] arr1 , int[] arr2){
        HashSet<Integer> numHashSet = new HashSet<>();
        for(int element : arr1){
            numHashSet.add(element);
        }
        for(int searchElement : arr2){
            if(!numHashSet.contains(searchElement)){
                return false;
            }
        }
        return true;
    }
}
