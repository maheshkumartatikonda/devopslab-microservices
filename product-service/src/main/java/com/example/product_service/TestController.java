package com.example.product_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController // Tells Spring this class handles HTTP requests
public class TestController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello from Product Service");
        map.put("status", "running");
        map.put("Product", "Product Table created in MySQL db on docker");
        return map; // Spring automatically converts this Map to JSON
    }
}