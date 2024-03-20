package com.manoj.projectjdk17.ds;

import java.util.Scanner;

public class StaticInitialization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the breadth and Height");
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();

        if( b< 0 && h <0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

        if(b<= 100 && h <= 100){
            System.out.println(b*h);
        }
    }
}
