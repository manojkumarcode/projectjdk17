package com.interview.twentysix;

import com.manoj.projectjdk17.streamapi.MainStreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestString {

    public static void main(String[] args) {
        List<String> words = List.of("Java", "SpringBoot", "Kafka", "Microservices");
        String longest = words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longest);

        System.out.println(words.stream().collect(Collectors.joining(", ")));

        Map<Boolean, List<Integer>> evenOddMap =  List.of(1,2,3,4,5,6).stream()
                .collect(Collectors.partitioningBy(n-> n % 2==0));

        System.out.println(evenOddMap.get(true));
        System.out.println(evenOddMap.get(false));

        List<Employee> employees = List.of(
                new Employee(1,"Amit", "IT", 90000),
                new Employee(2, "Neha", "IT", 120000),
                new Employee(3, "Ravi", "HR", 70000),
                new Employee(4, "Priya", "HR", 85000),
                new Employee(5, "Kiran", "IT", 120000),
                new Employee(6, "John", "Finance", 100000)
        );

        Map<String, Long> deptMap = employees.stream().
                collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
        System.out.println(deptMap);

        Map<String, Double> salMap = employees.stream().collect(Collectors.
                groupingBy(Employee::department, Collectors.averagingDouble(Employee::salary)));
        System.out.println(salMap);

        // Highest paid employee in each department

        Map<String, Optional<Employee>> maxSal = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::salary))
                ));
        System.out.println(maxSal);

        Map<String, List<Employee>> top2PaidEmp = employees.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(Employee::salary)
                                        .reversed())
                                .limit(2).toList()
                        )
                ));

        // second highest salary in each department

        Map<String, Optional<Double>> secondHighest = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.collectingAndThen(
                                Collectors.mapping(
                                        Employee::salary,
                                        Collectors.toList()
                                ),
                                salaries -> salaries.stream()
                                        .distinct().sorted(Comparator.reverseOrder())
                                        .skip(1)
                                        .findFirst()
                        )
                ));
        System.out.println("secondHighest --- " + secondHighest);

        // find department whose average salary exceeds 90000
        Map<String, Double> avgSal = employees.stream().collect(
                Collectors.groupingBy(Employee::department,
                        Collectors.averagingDouble(Employee::salary)))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 90000)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("department whose average salary exceeds 90000");
        System.out.println(avgSal);
        Map<String, Double> nameSal = employees.stream().collect(Collectors.toMap(
                Employee::name, Employee::salary, Math::max
        ));
        System.out.println("Employee name and salary");
        System.out.println(nameSal);

        List<List<Integer>> nested = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );
        List<Integer> listInt = nested.stream().flatMap(List::stream).toList();
        System.out.println(listInt);


    }

    record Employee(
            int id,
            String name,
            String department,
            double salary
    ) {}
}
