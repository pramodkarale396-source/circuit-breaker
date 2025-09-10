package com.address.address_service.service;

import com.address.address_service.dao.AddressRepo;
import com.address.address_service.pojos.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressImp implements AddressService{
    private AddressRepo addressRepo;
    @Autowired
    public void setAddressRepo(AddressRepo addressRepo) {}
    public AddressImp(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }
    @Override
    public Address getAddressByPostalCode(String postalCode) {

        return addressRepo.findByPostalCode(postalCode)
                .orElseThrow(() -> new RuntimeException("postal code not found"+postalCode));
    }
}
