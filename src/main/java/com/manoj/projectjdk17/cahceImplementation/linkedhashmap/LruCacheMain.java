package com.manoj.projectjdk17.cahceImplementation.linkedhashmap;

public class LruCacheMain {

    public static void main(String[] args) {
        LRUCache<String, Integer> cache  = new LRUCache<>(3);
        cache.put("One", 1);
        cache.put("Two", 2);
        cache.put("Three", 3);
        cache.entrySet().stream().forEach(System.out::println);
        cache.get("One");
        System.out.println("After Accessing One");
        cache.entrySet().stream().forEach(System.out::println);

        cache.put("Four", 4);
        cache.put("Five", 5);
        System.out.println("before Accessing One");
        cache.entrySet().stream().forEach(System.out::println);
        cache.get("One");
        System.out.println("after Accessing One");
        cache.entrySet().stream().forEach(System.out::println);
        cache.put("Six", 6);
        System.out.println("after adding Six");
        cache.entrySet().stream().forEach(System.out::println);
        System.out.println("Removed LRU");
        cache.removeLRU();
        cache.entrySet().stream().forEach(System.out::println);
    }

}
