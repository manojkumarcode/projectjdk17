package com.manoj.projectjdk17.streamapi.customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.manoj.projectjdk17.streamapi.customer.CustomerType.BUSINESS;
import static com.manoj.projectjdk17.streamapi.customer.CustomerType.INDIVIDUAL;

public class FakeCustomersDao {

    public static List<Customer> retrieveCustomers() {
        return List.of(
                new Customer(1,
                        "Lorraine M. Brown",
                        "17737278341",
                        INDIVIDUAL,
                        false,
                        Set.of("VISA", "MASTER", "AMEX", "CASH"),
                        new Address(
                                "Chicago",
                                "IL"
                        ),
                        50L,
                        LocalDate.of(2018, 3, 1)
                ),
                new Customer(2,
                        "Harold N. Robichaux",
                        "18137278341",
                        INDIVIDUAL,
                        true,
                        Set.of("VISA", "MASTER"),
                        new Address(
                                "Tampa",
                                "FL"
                        ),
                        100L,
                        LocalDate.of(2019, 4, 1)
                ),
                new Customer(3,
                        "Jesus L. Devoe",
                        "18137278341",
                        INDIVIDUAL,
                        true,
                        Set.of("VISA", "MASTER", "AMEX", "CASH", "DISCOVER"),
                        new Address(
                                "Gainesville",
                                "FL"
                        ),
                        25L,
                        LocalDate.of(2019, 5, 1)
                ),
                new Customer(4,
                        "Reynolds PLC",
                        "16057278341",
                        BUSINESS,
                        true,
                        Set.of("VISA", "DISCOVER"),
                        new Address(
                                "Sioux Falls",
                                "SD"
                        ),
                        150L,
                        LocalDate.of(2020, 6, 1)
                ),
                new Customer(5,
                        "Spencer Group",
                        "17737278341",
                        BUSINESS,
                        false,
                        Set.of("VISA", "AMEX"),
                        new Address(
                                "Chicago Ridge",
                                "IL"
                        ),
                        130L,
                        LocalDate.of(2019, 6, 1)
                )
        );
    }

    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> s.length();
        System.out.println(function.apply("manoj"));

        Map<CustomerType, List<Customer>> customersByType = retrieveCustomers().stream().collect(Collectors.groupingBy(Customer::getType));

        Map<CustomerType, Map<String, List<Customer>>> byTypeAndState = retrieveCustomers().stream().collect(Collectors.groupingBy(Customer::getType,
                Collectors.groupingBy(customer -> customer.getAddress().getState()) ));

        customersByType.entrySet().stream().forEach(System.out::println);
        customersByType.entrySet().stream().forEach(entry -> {
            System.out.println("Key:" + entry.getKey());
            entry.getValue().stream().forEach((customer) -> {
                System.out.println(customer.getId()  + "    " + customer.getAddress().getCity());
            });
        });


        retrieveCustomers().stream().collect(Collectors.groupingBy(Customer::getIsActive))
                .entrySet().stream().forEach(booleanListEntry -> {
                    System.out.println("Is Customer Active:" + booleanListEntry.getKey());
                    booleanListEntry.getValue().stream().forEach(c -> {
                                System.out.println("Customer details: " + c.getName() +  " -> Address: " + c.getAddress());
                            }
                    );
                });



    }

}
