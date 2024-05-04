package com.manoj.projectjdk17.ds;

public class BinarySearch {

    public static int binarySearch(int arr[], int element){
        int left = 0;
        int right = arr.length-1;
        int mid = -1;

        while (left <= right){
            mid = (left + (right -left))/2;
            if(arr[mid] == element){
                System.out.println("Element found");
                return mid;
            }else if(element > arr[mid]){
                System.out.println("left = mid + 1");
                left = mid + 1;
            }else{
                System.out.println("right = mid + 1");
                right = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        binarySearch(arr,2);

    }
}
