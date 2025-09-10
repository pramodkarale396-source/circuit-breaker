package com.app.order_service.controller;

import com.app.order_service.pojos.Order;
import com.app.order_service.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping
    public Order getOrder(@RequestParam("orderNumber") String orderNumber){
        return orderService.getOrderByPostCode(orderNumber);
    }
}
