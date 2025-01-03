package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CustomerTest {

    @Test
    void save() {

        var customer = new Customer("Customer", null);

        var address = Arrays.asList(
                new Address("Rua A", "1", "Disctrict", "City")
        );

        customer.setAddress(address);

        //assertEquals(customer.getAddress());
    }

}