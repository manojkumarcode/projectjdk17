package com.manoj.projectjdk17.worldline.test;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton(){

    }

    public MySingleton getInstance(){
        if(instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return  instance;
    }
}
