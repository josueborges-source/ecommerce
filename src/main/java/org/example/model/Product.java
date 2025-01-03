package org.example.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {

    private String id;
    private String name;
    private String description;
    private Double price;


    public Product( String name, String description, Double price)
    {
        this.id =  UUID.randomUUID().toString();;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

