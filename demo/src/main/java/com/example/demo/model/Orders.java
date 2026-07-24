package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Orders {

    @Id
    @GeneratedValue
    private Long id;

    private String productName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
