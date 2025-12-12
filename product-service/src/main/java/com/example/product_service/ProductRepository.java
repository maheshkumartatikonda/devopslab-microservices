package com.example.product_service;
import org.springframework.data.jpa.repository.JpaRepository;

// This gives you save(), findAll(), findById() automatically
public interface ProductRepository extends JpaRepository<Product, Long> {
}