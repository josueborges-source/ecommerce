package org.example.model;

import lombok.Data;

@Data
public class Product {

    private Long id;
    private String name;
    private String description;
    private String price;

    public Product(Long id, String name, String description, String price)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

