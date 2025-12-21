package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.service

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repo;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public User register(User user) {

        // hash password before saving
        user.setPassword(encoder.encode(user.getPassword()));

        // default role
        if (user.getRole() == null || user.getRole().isBlank()) {
            user.setRole("ANALYST");
        }

        return repo.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return repo.findByEmail(email).orElse(null);
    }
}
