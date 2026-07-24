package com.example.demo.service;

import com.example.demo.model.Orders;
import com.example.demo.model.User;
import com.example.demo.respository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;
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

    public void deleteCascade(){
        User user = userRepo.findById(1L).get();
        userRepo.delete(user);
    }

    public String nPlus1(){

        List<User>  users = userRepo.findAllWithOrders();

        for (User user : users) {
            System.out.println(user.getName());

            for(Orders order :  user.getOrders()){
                System.out.println(order.getProductName());
            }

            System.out.println();
        }

        return "Done";
    }
}