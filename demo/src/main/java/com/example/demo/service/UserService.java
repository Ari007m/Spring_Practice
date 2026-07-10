package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;

@Service
public class UserService {

    @Async
    public CompletableFuture<String> getUser() {

        System.out.println(
                LocalTime.now() +
                        " Worker: " +
                        Thread.currentThread().getName()
        );
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return CompletableFuture.completedFuture("User Loaded");
    }
}