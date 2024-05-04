package com.manoj.projectjdk17.threads;

public class Producer implements Runnable{
    Counter counter;

    public Producer(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        synchronized(counter){

            while(true) {
                if (counter.getCount() < 1000) {
                    counter.increment();
                    System.out.println("Produced" + counter.getCount());
                    counter.notify();
                } else {
                    try {
                        Thread.sleep(10000);
                        counter.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

}
