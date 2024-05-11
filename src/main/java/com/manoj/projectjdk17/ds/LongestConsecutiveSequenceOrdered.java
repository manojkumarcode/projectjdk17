package com.manoj.projectjdk17.ds;

public class LongestConsecutiveSequenceOrdered {

    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 2 , 8,10,3};
        findConsecutiveSequence(arr);
        int[] arr2 = {4,9,8,1,2,3,4,5,9,3,4,5,6,7,8,9,10,1,2,3};
        findConsecutiveSequence(arr2);
    }

    public static void findConsecutiveSequence(int arr[]){

        int START_INDEX = -1;
        int END_INDEX = -1;
        int max = 0;


        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            int startIndex = i;

            while ( (i+1) < arr.length && (arr[i+1] - arr[i]) == 1 ){
                i++;
                count++;
            }

            if(count > max){
                max = count;
                END_INDEX = i;
                START_INDEX = startIndex;
            }

        }

        System.out.println("Length of Sequence = " + max);
        System.out.println("START_INDEX = " + START_INDEX);
        System.out.println("END_INDEX= " + END_INDEX);


    }
}
