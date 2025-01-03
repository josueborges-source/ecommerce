package org.example.repository;

import org.example.model.Address;
import org.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
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

    public Customer updateAddress(String id, Address address) {
        Customer customer = findById(id);
        customer.setAddress(List.of(address));
        return customer;
    }
}
