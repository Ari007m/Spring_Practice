package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.UserPrincipal;
import com.example.Course.Registration.System.model.Users;
import com.example.Course.Registration.System.repository.UserDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDetailRepo repo;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.getByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("User Name not found");
        }
        return new UserPrincipal(user);
    }

    public void add(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        repo.save(user);
    }

    public List<Users> getAllUsers() {
        return repo.findAll();
    }
}
