package com.address.address_service.service;

import com.address.address_service.pojos.Address;

public interface AddressService {

    Address getAddressByPostalCode(String postalCode);
}
