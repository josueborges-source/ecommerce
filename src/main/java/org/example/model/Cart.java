package org.example.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {
    private String id;
    List<Product> products= new ArrayList<Product>();

    public Cart(List<Product> products) {
        this.products = products;
    }

    void addProduct(Product product){
        products.add(product);
    }

    void removeProduct(Product product){
        products.remove(product);
    }

    Integer productsSum(){
        return products.size();
    }



}
