package org.example.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Address {

    private String id;
    private String street;
    private String number;
    private String district;
    private String city;

    public Address(String street, String number, String district, String city) {
        this.id = UUID.randomUUID().toString();
        this.street = street;
        this.number = number;
        this.district = district;
        this.city = city;
    }


}
