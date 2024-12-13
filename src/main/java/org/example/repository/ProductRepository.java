package org.example.repository;

import org.example.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private Map<Long, Product> products = new HashMap<>();

    public Product save (Product product){
        products.put(product.getId(), product);
        return product;
    }

    public Product findById(Long id) {
       return  products.get(id);
    }

}
