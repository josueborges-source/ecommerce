package org.example.repository;

import org.example.model.Cart;
import org.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class CartRepository {
    private Map<String, Cart> cart = new HashMap<>();

    public Cart save (Cart cart){
        String id = UUID.randomUUID().toString();
        cart.setId(id);
        this.cart.put(cart.getId(), cart);
        return this.cart;
    }

    public Cart getCart(String id) {
        return cart.get(id);
    }

    public void deleteById(String id) {
        cart.remove(id);
    }
}
