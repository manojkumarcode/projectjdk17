package com.test.polymorphism;

import java.io.FileNotFoundException;

public class Employee extends Person{
    protected String drive() throws FileNotFoundException {
        return "Employee is driving";
    }
}
