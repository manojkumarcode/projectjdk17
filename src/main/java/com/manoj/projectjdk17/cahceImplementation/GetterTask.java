package com.manoj.projectjdk17.cahceImplementation;

import org.apache.kafka.common.protocol.types.Field;

import java.util.concurrent.Callable;

public class GetterTask<K, V> implements Callable<V> {
    K key;
    public GetterTask(K key){
        this.key = key;
    }
    @Override
    public V call() throws Exception {
        Cache<K, V> cache = CacheImpl.getInstance();
        //System.out.println("Last key accessed :" + key);
        V value = cache.get(key);
        if(value != null) {
            //System.out.println("value:" + value);
        }
        return value;
    }
}
