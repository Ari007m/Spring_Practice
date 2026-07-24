package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/jpa")
public class JpaController {

    private final UserService userService;

    @DeleteMapping("/test-delete")
    public void testDelete() {
        userService.deleteCascade();
    }

    @GetMapping("/nPlus1")
    public String testNPlus1() {
        return userService.nPlus1();
    }
}
