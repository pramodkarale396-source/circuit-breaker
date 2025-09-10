package com.address.address_service.dao;

import com.address.address_service.pojos.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
    Optional<Address> findByPostalCode(String postalCode);
}
