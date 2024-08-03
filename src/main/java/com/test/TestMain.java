package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {

    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};

        int arr2[] = {0,0,0,0,0} ;

        for (int i = 0;  i < arr.length; i++) {
            if(arr2[arr[i]] == 0){
                arr2[arr[i]] = 1;
            } else {
                arr2[arr[i]] = 2;
            }

        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == 1){
                System.out.println(arr2[i]);
            }

        }

        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1==i2);

        // space
       // time - linear

        int ii = 9;
        int j = 0;

        try{
            int x = ii/j;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){

        }

        List<Integer> integerList = List.of(2,5,8,9,4,7);
        Stream<Integer> stream = integerList.stream();
        integerList.add(34);
        stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

//        List<Integer> integerList = List.of(2,5,8,9,4,7);
//        Stream<Integer> stream = integerList.stream();
        integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

       // -----
       // List<Integer> integerList1 = List.of(2,5,8,9,4,7);
        Stream<Integer> stream1 = integerList.stream();

        stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());  // 2, 8,4

        stream1.filter(i -> i % 2 != 0).collect(Collectors.toList());

//        try {
//            FileInputStream f = new FileInputStream("ds");
//        } catch (FileNotFoundException e | Exception e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            FileInputStream f = new FileInputStream("ds");
//        } catch (IOException e1 | FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
