package org.example.repository;

import org.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class CustomerRepository {
    private final Map<String, Customer> customers = new HashMap<>();

    public Customer save (Customer customer){
        customer.setId(UUID.randomUUID().toString());
        customers.put(customer.getId(), customer);

        return customer;
    }

    public Customer findById(String id) {
        return customers.get(id);
    }

    public void deleteById(String id) {
        customers.remove(id);
    }
}
