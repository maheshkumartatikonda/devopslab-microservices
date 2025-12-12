package com.example.order_service;

import org.springframework.data.mongodb.repository.MongoRepository;
// This gives you save(), findAll(), findById() automatically
public interface OrderRepository extends MongoRepository<Order, String>
{
}
