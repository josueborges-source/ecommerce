package org.example.controller;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer){
        return repository.save(customer);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer get(@PathVariable String id){
        return repository.findById(id);
    }
}


