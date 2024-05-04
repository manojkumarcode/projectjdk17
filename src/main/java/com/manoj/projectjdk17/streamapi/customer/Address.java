package com.manoj.projectjdk17.streamapi.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Address {

    private String city;
    private String state;
}
