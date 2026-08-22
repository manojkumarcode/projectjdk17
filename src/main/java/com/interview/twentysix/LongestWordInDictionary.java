package com.interview.twentysix;

import java.util.*;
import java.util.stream.Collectors;

public class LongestWordInDictionary {
    /**
     * // Given a string of letters and a dictionary, the function longestWord should
     * //     find the longest word or words in the dictionary that can be made from the letters
     * //     Input: letters = "oet", dictionary = {"to","toe","toes"}
     * //     Output: {"toe"}
     */
    public static void main(String[] args) {

        Set<String> dictionary = new HashSet<String>(
                Set.of("to", "toe", "toes", "Toes", "oet", "teo", "ot"));
        String input = "oet";
        System.out.println("longestMatch:" + longestMatch(input, dictionary));
        System.out.println("longestMatch_groupingBy:" + longestMatch_groupingBy(input, dictionary));
        System.out.println("longestMatch_useTreeMap:" + longestMatch_useTreeMap(input, dictionary));

    }

    static String longestMatch(String letters, Set<String> dictionary){
        int[] available = new int[26];
        for(char c: letters.toLowerCase().toCharArray()){
            if(c >= 'a' && c <= 'z'){
                available[c -'a']++;
            }
        }
        List<String> filteredList = dictionary.stream().filter( word -> canForm(word, available)).toList();
        int maxLen = filteredList.stream().mapToInt(String::length).max().orElse(0);
        List<String> longest = filteredList.stream().filter(element -> element.length() == maxLen).toList();
        return longest.get(0);
    }

    static String longestMatch_groupingBy(String letters, Set<String> dictionary){
        int[] available = new int[26];
        for(char c: letters.toLowerCase().toCharArray()){
            if(c >= 'a' && c <= 'z'){
                available[c -'a']++;
            }
        }
         Map<Integer, List<String>> map = dictionary.stream().filter( word -> canForm(word, available))
                 .collect(Collectors.groupingBy(String::length));
        map.entrySet().forEach(System.out::println);
         return map.isEmpty() ? null : map.get(Collections.max(map.keySet())).get(0);

    }

    static String longestMatch_useTreeMap(String letters, Set<String> dictionary){
        int[] available = new int[26];
        for(char c: letters.toLowerCase().toCharArray()){
            if(c >= 'a' && c <= 'z'){
                available[c -'a']++;
            }
        }
        Map<Integer, List<String>> map = dictionary.stream().filter( word -> canForm(word, available))
                .collect(Collectors.groupingBy(String::length,
                        () -> new TreeMap<>(Comparator.reverseOrder()) , Collectors.toList()));

        map.entrySet().forEach(System.out::println);

        return map.isEmpty() ? null : map.get(Collections.max(map.keySet())).get(0);

    }

    static boolean canForm(String word, int[] available){
        int[] need = new int[26];
        for(char ch : word.toLowerCase().toCharArray()){
            if(ch < 'a' || ch > 'z') {
                return false;
            }
            int idx = ch - 'a';
            if( ++need[idx] > available[idx]){
                //System.out.println(word + " available is: " + false );
                return false;
            }
        }
        //System.out.println(word + " available is: " + true );
        return true;
    }

}
