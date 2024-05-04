package com.manoj.projectjdk17.threads;

public class Consumer implements Runnable{
    Counter counter;

    public Consumer(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (counter) {
                if (counter.getCount() == 0) {

                    try {
                        Thread.sleep(10000);
                        counter.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("Consumed" + counter.decrement());
                    counter.notify();
                }
            }
        }
    }
}
