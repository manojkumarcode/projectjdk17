package com.manoj.projectjdk17.ice;

public class StaticTest1 {

    static int count;

    public StaticTest1(int val){
        System.out.println("boo");
        count = val;
    }

    public static void main(String[] args) {
        System.out.println("foo");
        StaticTest1 fistobj = new StaticTest1(100);
        StaticTest1 secondObj = new StaticTest1(300);

        System.out.println(fistobj.count);
        System.out.println(secondObj.count);
        secondObj.increment();
        System.out.println(secondObj.count);
    }

    public int increment(){
        return ++count;
    }

    static{
        System.out.println("static");
    }

}
