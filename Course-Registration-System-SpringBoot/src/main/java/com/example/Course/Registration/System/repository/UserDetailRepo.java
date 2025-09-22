package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepo extends JpaRepository<Users, Integer> {
    Users getByUserName(String username);
}
