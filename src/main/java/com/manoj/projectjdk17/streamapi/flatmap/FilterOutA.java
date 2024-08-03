package com.manoj.projectjdk17.streamapi.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
we want to filter out the a and print out all the characters.
 */
public class FilterOutA {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        final Stream<String[]> stream = Arrays.stream(array);


        final List<String[]> a1 = stream.filter(a -> a.equals("a")) // x is a String[], not String!
                .collect(Collectors.toList());

        a1.stream().forEach(System.out::println); // output nothing



        // process the String[] array
        List<String[]> result = Arrays.stream(array).filter(stringArr -> {
            for (String val : stringArr) {
                if (val.equalsIgnoreCase("a")) {
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toList());

        result.forEach( x -> System.out.println(Arrays.toString(x)));

        /*In Java, to convert a 2d array into a 1d array,
        we can loop the 2d array and put all the elements into a new array;
        Or we can use the Java 8 flatMap to flatten the 2d array into a 1d array,
         or from Stream<String[]> to Stream<String>
         */

        Stream<String> stringStream = Stream.of(array).flatMap(Stream::of);
        stringStream.filter(a-> !a.equalsIgnoreCase("a")).forEach(System.out::println);



    }
}
