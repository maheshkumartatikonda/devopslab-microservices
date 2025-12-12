package com.example.order_service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "orders") // MongoDB equivalent of @Entity
public class Order {
    @Id
    private String id;
    private String productName;
    private LocalDateTime orderDate = LocalDateTime.now();

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public LocalDateTime getOrderDate() { return orderDate; }
}