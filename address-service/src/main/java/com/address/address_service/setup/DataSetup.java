package com.address.address_service.setup;

import com.address.address_service.dao.AddressRepo;
import com.address.address_service.pojos.Address;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataSetup {
//    @Autowired
//    private AddressRepo addressRepo;
//    @PostConstruct
//    public void setupData(){
//        addressRepo.saveAll(Arrays.asList(
//                Address.builder().id(1).postalCode("1000001").state("Tokyo").city("Chiyoda")
//                        .build(),
//                Address.builder().id(2).postalCode("1100000").state("Tokyo").city("Taito").build(),
//                Address.builder().id(3).postalCode("2100001").state("Kanagawa").city("Kawasaki")
//                        .build()));
//    }
}
