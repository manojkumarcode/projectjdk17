package com.manoj.projectjdk17.threads;

public class MainRunner {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread producer = new Thread(new Producer(counter));
        Thread consumer = new Thread(new Consumer(counter));
        producer.start();
        consumer.start();

    }
}
