package com.manoj.projectjdk17.cahceImplementation;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GetterTaskRunner implements Runnable{
    @Override
    public void run() {
        System.out.println("GetterTaskRunner started");

        while(true){

            Random random = new SecureRandom();
            int key = random.nextInt(100);

            GetterTask task = new GetterTask(String.valueOf(key));
            ExecutorService threadPool = Executors.newFixedThreadPool(10);

            Future future = threadPool.submit(task);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                if(future.isDone() && future.get() != null) {
                   // System.out.println("search for Key:" + key + " value found is :" + future.get());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
