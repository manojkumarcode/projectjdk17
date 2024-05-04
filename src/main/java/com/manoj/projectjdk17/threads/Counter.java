package com.manoj.projectjdk17.threads;

public class Counter {

    int count = 0;

    void increment(){
        this.count++;
    }

    int getCount(){
        return this.count;
    }
    int decrement(){
        count--;
        return count;
    }


}
