package org.example.model;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Customer {

    private String id;
    private String name;
    private List<Address> address;

    public Customer(String name, List<Address> address) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
    }
}
