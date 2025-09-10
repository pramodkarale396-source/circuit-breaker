package com.app.order_service.pojos;

import lombok.Data;

@Data
public class Failure implements Type {
    private final String msg;
}
