package org.example.repository;

import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private final Map<String, Product> products = new HashMap<>();

    public Product save (Product product){
        products.put(product.getId(), product);
        return product;
    }

    public Product findById(String id) {
       return products.get(id);
    }

    public void deleteById(String id) {
         products.remove(id);
    }
}
