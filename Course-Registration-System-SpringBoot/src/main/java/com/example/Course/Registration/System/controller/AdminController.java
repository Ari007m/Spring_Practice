package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.model.Users;
import com.example.Course.Registration.System.service.CourseService;
import com.example.Course.Registration.System.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    CourseService courseService;

    @Autowired
    MyUserDetailsService userService;

    @PostMapping("/add-user")
    public void addUser(@RequestBody Users user){
        userService.add(user);
    }

    @GetMapping("/users")
    public List<Users> allUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/courses-enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }
}
