package com.example.demo.respository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    @Query("""
    SELECT DISTINCT u
    FROM User u
    LEFT JOIN FETCH u.orders
    """)
    List<User> findAllWithOrders();
}
