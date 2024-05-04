package com.manoj.projectjdk17.cahceImplementation.linkedhashmap;

import com.manoj.projectjdk17.cahceImplementation.Cache;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CacheImplUsingLinkedHashMap<K,V> implements Cache<K,V> {

    private static volatile CacheImplUsingLinkedHashMap instance = null;
    private static final Lock lock = new ReentrantLock();

    private static volatile int cacheSize ;
    LinkedHashMap<K,V> linkedHashMap  = null;

    private CacheImplUsingLinkedHashMap(){
        linkedHashMap = new LinkedHashMap<>();

    }

    public static CacheImplUsingLinkedHashMap getInstance(int cacheSize){
        if(instance == null){
            lock.lock(); //locking
            try {
                if (instance == null) {
                    cacheSize = cacheSize;
                    instance = new CacheImplUsingLinkedHashMap();
                }
            }finally {
                lock.unlock();
            }
        }
        return instance;
    }

    @Override
    public void put(K key, V value) throws Exception {
        if(linkedHashMap.size() < cacheSize  ) {
            linkedHashMap.put(key, value);
        }else{
            System.out.println("Cache is full, as the size is:" + linkedHashMap.size());
            //linkedHashMap.
        }
    }

    @Override
    public V get(K key) {
        return linkedHashMap.get(key);
    }
}
