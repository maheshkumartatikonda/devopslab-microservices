package com.example.product_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000") // Allow React to access
public class ProductController {

    @Autowired
    private ProductRepository repository;

    // GET http://localhost:8080/products
    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // POST http://localhost:8080/products
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }
}