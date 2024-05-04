package com.manoj.projectjdk17.cahceImplementation.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    public void removeLRU(){
        if(!isEmpty()){
            K lrukey = entrySet().iterator().next().getKey();
            remove(lrukey);
        }
    }


}
