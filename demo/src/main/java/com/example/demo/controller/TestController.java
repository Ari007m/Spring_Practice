package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import com.example.demo.exceptions.ProductNotFoundException;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Something went wrong");
    }

    @GetMapping("/try")
    public String testTry() {
        try {
            throw new RuntimeException("Boom");
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("/product")
    public String getProduct() {
        throw new ProductNotFoundException("Product not found");
    }

    @GetMapping("/divide")
    public int divide() {
        return 10 / 0;
    }

    @GetMapping("/null")
    public String testNull() {
        String text = null;
        return text.toUpperCase();
    }

    @PostMapping("/user")
    public String createUser(@Valid @RequestBody UserRequest request) {
        return "User created";
    }
}