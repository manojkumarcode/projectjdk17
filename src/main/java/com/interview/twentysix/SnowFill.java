package com.interview.twentysix;

public class SnowFill {
    /*
     ** Instructions to candidate.
     **  1) Given an array of non-negative integers representing the elevations
     **     from the vertical cross section of a range of hills, determine how
     **     many units of snow could be captured between the hills.
     **
     **     See the example array and elevation map below.
     **                                 ___
     **             ___                |   |        ___
     **            |   |        ___    |   |___    |   |
     **            |   |    ___|   |   |   |   |   |   |
     **            |___|___|___|___|___|___|___|___|___|___
     **             {3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
     **                                 ___
     **             ___                |   |        ___
     **            |   | *   *  _*_  * |   |_*_  * |   |
     **            |   | *  _*_|   | * |   |   | * |   |
     **            |___|_*_|___|___|_*_|___|___|_*_|___|___
     **            { 3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
     **
     **     Solution: In this example 13 units of snow (*) could be captured.
     **
     **  2) Consider adding some additional tests in doTestsPass().
     **  3) Implement computeSnowpack() correctly.
     */

    public static void main(String[] args) {
        int[] arr  = {3,0,1,2,0,4,2,0,3,0};
     //   int snowFillCount = getSnowFillCount(arr);

        System.out.println("snowFillCount" + ": " + getSnowFillCount(new int[] {3,0,1,2,0,4,2,0,3,0}));
        System.out.println("snowFillCount" + ": " + getSnowFillCount(new int[]{3,0,0,0,2}));
        System.out.println("snowFillCount" + ": " + getSnowFillCount(new int[]{2,0,0,0,3}));
        System.out.println("snowFillCount" + ": " + getSnowFillCount(new int[]{2,0,2}));
        System.out.println(getSnowFillCount(new int[]{4,2,0,3,2,5}));
    }

    private static int getSnowFillCount(int[] arr) {
        int leftMax = 0;
        int rightMax = 0;
        int count = 0;
        int left = 0, right = arr.length - 1;
        while(left < right){
           if(arr[left] < arr[right]){
               if(arr[left] >= leftMax ) {
                   leftMax = arr[left];
               }else {
                   count = count + leftMax - arr[left];
               }
               left++;
           }else{
               if(arr[right] >= rightMax) {
                   rightMax = arr[right];
               }else {
                   count = count + rightMax - arr[right];
               }
               right--;
           }
        }

        return count;
    }

}
