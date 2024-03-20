package com.manoj.projectjdk17.streamapi;

import java.util.Arrays;
import java.util.List;

public class MainStreamAPI {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Bob", 18),
                new Student("Ted", 17),
                new Student("Zeka", 18));

        students.stream().filter((student) -> student.getAge() == 18 ).forEach(System.out::println);
    }
}
