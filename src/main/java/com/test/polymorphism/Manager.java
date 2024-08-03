package com.test.polymorphism;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Manager extends Employee{
    @Override
    public final String drive() {
        return "Manager is driving";
    }
    public static void main(String[] args) {
        final Employee emp = new Manager();
        try {
            System.out.println(emp.drive());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String str = "fiddle";
        Arrays.asList(str.toCharArray());
    }
}
