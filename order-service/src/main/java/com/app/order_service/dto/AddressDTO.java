package com.app.order_service.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private Integer id;
    private String postalCode;
    private String state;
    private String city;
}
