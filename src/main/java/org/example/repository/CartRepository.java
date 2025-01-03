package org.example.repository;

import org.example.model.Cart;
import org.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class CartRepository {
    private final Map<String, Cart> carts = new HashMap<>();

    public Cart save (Cart cart){
        String id = UUID.randomUUID().toString();
        cart.setId(id);
        this.carts.put(cart.getId(), cart);
        return cart;
    }

    public Cart getCart(String id) {
        return carts.get(id);
    }

    public void deleteById(String id) {
        carts.remove(id);
    }
}
