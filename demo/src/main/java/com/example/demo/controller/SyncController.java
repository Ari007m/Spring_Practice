package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/sync")
public class SyncController {

    @GetMapping
    public String sync() throws InterruptedException {

        System.out.println("Started: " + Thread.currentThread().getName());
        Thread.sleep(10000);
        System.out.println(LocalTime.now() + "Finished: " + Thread.currentThread().getName());
        return "Sync Completed";
    }
}