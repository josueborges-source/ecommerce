package org.example.repository;

import org.example.model.Address;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class AddressRepository {
    private Map<String, Address> addressList = new HashMap<>();

    public Address save (Address address){
        String id = UUID.randomUUID().toString();
        address.setId(id);
        this.addressList.put(address.getId(), address);
        return address;
    }

    public Address getAddress(String id) {
        return addressList.get(id);
    }

    public void deleteById(String id) {
        addressList.remove(id);
    }
}
