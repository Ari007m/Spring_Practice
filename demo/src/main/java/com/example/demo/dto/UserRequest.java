package com.example.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UserRequest(
        @NotBlank
        String name,
        @Min(18)
        int age
) {}
