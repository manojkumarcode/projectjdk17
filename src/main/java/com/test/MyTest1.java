package com.test;

import org.apache.el.stream.Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyTest1 {
    public static void main(String[] args) {
        String str = "iloveprogramming";

        char[] chars =  str.toCharArray();

        Character[] characters = new Character[chars.length];
        for(int i = 0 ; i< characters.length; i++){
            characters[i] = chars[i];
        }

//        int[] a = {1,1,23};
//        Arrays.stream(a);

        Map<Character, Long> map = Arrays.stream(characters).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Map.Entry<Character, Long>> answer = map.entrySet().stream().filter(entry ->  entry.getValue() ==1).findFirst();
       if(answer.isPresent())
        {
            Map.Entry<Character, Long> e =  answer.get();
            System.out.println(e.getKey());
        }


    }
}
