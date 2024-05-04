package com.manoj.projectjdk17.cahceImplementation;

public class CacheMain {

    public static void main(String[] args) {

        Thread t1 = new Thread(new PutTaskRunner());
        Thread t2 = new Thread(new GetterTaskRunner());

        t1.start();
        t2.start();


    }
}
