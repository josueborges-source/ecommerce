package org.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Product;
import org.junit.jupiter.api.Test;

class ProductRepositoryTest {

    private ProductRepository productRepository = new ProductRepository();
    Product product = new Product( "Tv", "Smart Tv", 2000.00);

    @Test
    void save() {

        // WHEN
        var result  = productRepository.save(product);

        // THEN
        assertEquals(result, product);
    }

    @Test
    void findById() {

        // GIVEN
        productRepository.save(product);

        // WHEN
        var result =  productRepository.findById("1");

        // THEN
        assertEquals(result, product);
    }

    @Test
    void deleteById() {

        // GIVEN
        productRepository.save(product);

        // WHEN

        // TODO: productRepository.deleteById(1L);

        // THEN
        var product = productRepository.findById("1");

        assertNull(product);
    }
}