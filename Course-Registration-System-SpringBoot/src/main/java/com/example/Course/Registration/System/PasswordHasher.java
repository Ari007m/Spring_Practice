package com.example.Course.Registration.System;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder(12);
        String pt = "Ari123";
        String hashedPassword =encoder.encode(pt);
        System.out.print(pt + " : " + hashedPassword);
    }
}
