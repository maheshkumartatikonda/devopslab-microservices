package com.example.order_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository repo;

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return repo.save(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return repo.findAll();
    }
}