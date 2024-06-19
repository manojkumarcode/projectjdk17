package com.manoj.projectjdk17.worldline.test;

import org.apache.kafka.common.protocol.types.Field;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        List<Integer> newlist = List.of(1,2,2,2,3,3,4,5,5,6,7,8);


        newlist = List.of(10,21,2,22,3,38,4,5,58,6,7,8);

        List<Integer> newlist8   = newlist.stream().sorted().limit(3).collect(Collectors.toList());

        newlist.stream().sorted(Comparator.reverseOrder()).limit(3);

        newlist.stream().distinct().forEach(System.out::println);

        final Map<Integer, Long> collected = newlist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        final Map<Integer, Integer> collected2 = newlist.stream().collect(Collectors.groupingBy(Integer::intValue),
//                Collectors.counting(Integer::intValue));


        Arrays.stream(arr).filter(e -> e%2 ==0 ).forEach(System.out::println);

        List<Integer> list = newlist.stream().filter(e -> e%2 ==0 ).collect(Collectors.toList());

//        List<Integer> list2 =  newlist.stream().collect(Collectors.filtering((e -> e%2 ==0),
//                Collectors.filtering((e -> e%2 !=0), Collectors.toList())).finisher();
//
//        HashMap<Boolean, List<Integer> map  =
//
//                newlist.stream().collect(Collectors.partitioningBy((e -> e%2 ==0)));


    }
}
