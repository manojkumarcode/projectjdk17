package com.manoj.projectjdk17.cahceImplementation;

import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class CacheImpl<K,V> implements Cache<K,V>{

    private static CacheImpl<?, ?> instance;

    static {
        instance = new CacheImpl<>(50);
    }

    private int cacheSize;
    Queue<K> queue;
    private ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>(cacheSize);

    private CacheImpl (int cacheSize){
        this.cacheSize = cacheSize;
        queue = new ConcurrentLinkedQueue<>();

    }
    public static <K,V> CacheImpl<K,V> getInstance(){
        return (CacheImpl<K,V>) instance;
    }
    @Override
    public void put(K key, V value) throws Exception {
        if(map.size() <  cacheSize) {
            map.put(key, value);
            queue.add(key);
        }else {
            //System.out.println("Cache is full, so removing the LRU item");
            //System.out.println("queue before removing:" + queue);
            if(queue.isEmpty()){
                System.out.println("queue is empty");
                return;
            }
            K keyToRemove = queue.remove();
            //System.out.println("queue after removing:" + queue);
            map.remove(keyToRemove);
            map.put(key, value);
        }
    }

    @Override
    public V get(K key) {
        V value = map.get(key);
        if(value != null){
          //  System.out.println(queue);
            boolean removed = queue.remove(key);
            boolean added = queue.add(key);
           // System.out.println("removed and added key in the queue is : " + key);
           // System.out.println(queue);
        }
        return value;
    }
}
