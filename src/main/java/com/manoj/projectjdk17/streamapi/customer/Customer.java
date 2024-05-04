package com.manoj.projectjdk17.streamapi.customer;

import java.time.LocalDate;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Customer {

    private Integer id;
    private String name;
    private String phoneNumber;
    private CustomerType type;
    private Boolean isActive;
    private Set<String> paymentMethods;
    private Address address;
    private Long purchaseQty;
    private LocalDate createdAt;
}