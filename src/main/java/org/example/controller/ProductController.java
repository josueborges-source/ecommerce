package org.example.controller;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product save(@RequestBody Product product){
        return repository.save(product);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product get(@PathVariable String id){
        return repository.findById(id);
    }
}


