package com.manoj.projectjdk17.streamapi.customer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Main {
    public static void main(String[] args) {

        List<Customer> customerList = FakeCustomersDao.retrieveCustomers();

        //group the customer by their type
        System.out.println("group the customer by their type");

        Map<CustomerType, List<Customer>>  customerTypeListMap
                = customerList.parallelStream().collect(Collectors.groupingBy(Customer::getType));

        customerTypeListMap.entrySet().parallelStream().forEach(entry ->
        {
            System.out.println("Key: " +  entry.getKey());
            System.out.println("Value: " + entry.getValue());
        });

        //count the customer by their type
        System.out.println("count the customer by their type");

        Map<CustomerType, Long>  countByCustomerTypeMap
                = customerList.parallelStream().collect(Collectors.groupingBy(Customer::getType, Collectors.counting()));

        countByCustomerTypeMap.entrySet().parallelStream().forEach(entry ->
        {
            System.out.print("Customer Type: " +  entry.getKey());
            System.out.println(", Count: " + entry.getValue());
        });


        // group the customers by their type and their state they are residing
        System.out.println("group the customers by their type and their state they are residing");

        Map<CustomerType, Map<String,List<Customer>>>  byTypeAndStateList =
                customerList.parallelStream().collect
                        (Collectors.groupingBy(Customer::getType, Collectors.groupingBy(customer -> customer.getAddress().getState())));

        byTypeAndStateList.entrySet().parallelStream().forEach(entry ->
        {
            System.out.println("CustomerType: " +  entry.getKey());
            entry.getValue().entrySet().stream().forEach(e -> {
                System.out.println("State: " + e.getKey());
                System.out.println("Customer: " + e.getValue());
            });

        });


        // count the customers by their type and their state they are residing
        System.out.println("count the customers by their type and their state they are residing");

        Map<CustomerType, Map<String,Long>>  byTypeAndStateCountList =
                customerList.parallelStream().collect
                        (Collectors.groupingBy(Customer::getType, Collectors.groupingBy(customer -> customer.getAddress().getState(),
                                Collectors.counting())));

        byTypeAndStateCountList.entrySet().parallelStream().forEach(entry ->
        {
            System.out.println("CustomerType: " +  entry.getKey());
            entry.getValue().entrySet().stream().forEach(e -> {
                System.out.print("State: " + e.getKey());
                System.out.println(", Count: " + e.getValue());
            });

        });



    }
}
