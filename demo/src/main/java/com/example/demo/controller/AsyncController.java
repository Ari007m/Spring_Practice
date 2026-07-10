package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/async")
@RequiredArgsConstructor
public class AsyncController {

    private final UserService service;

    @GetMapping
    public CompletableFuture<String> async() {
        System.out.println(
                LocalTime.now() +
                        " Controller: " +
                        Thread.currentThread().getName()
        );
        return service.getUser();
    }
}