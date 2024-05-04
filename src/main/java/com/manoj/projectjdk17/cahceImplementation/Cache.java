package com.manoj.projectjdk17.cahceImplementation;

public interface Cache<K,V> {

    void put(K key, V value) throws Exception;  // Add the value to the cached mapped to a key

    V get(K key);  // get the Value from the cache;
}
