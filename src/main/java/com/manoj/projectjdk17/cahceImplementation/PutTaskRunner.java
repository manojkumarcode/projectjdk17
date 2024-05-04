package com.manoj.projectjdk17.cahceImplementation;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PutTaskRunner implements Runnable{
    @Override
    public void run() {

        System.out.println("PutTaskRunner started");

        while (true) {
            Cache<String, Integer> cache = CacheImpl.getInstance();

            Random beginRandom = new SecureRandom();
            int begin = beginRandom.nextInt(50);
            int end = begin + 1 + beginRandom.nextInt(100 - begin -1);
            //System.out.println("Begin: " + begin);
            //System.out.println("End: " + end);

            for (int i = begin; i <= end; i++) {
                try {
                    cache.put(String.valueOf(i), 100 + i);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
