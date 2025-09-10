package com.app.order_service.service;

import com.app.order_service.pojos.Order;
import com.app.order_service.pojos.Type;

public interface OrderService {
    Order getOrderByPostCode(String orderNumber);
}
