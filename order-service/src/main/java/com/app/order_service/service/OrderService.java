package com.app.order_service.service;

import com.app.order_service.pojos.Type;

public interface OrderService {
    Type getOrderByPostCode(String orderNumber);
}
