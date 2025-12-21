package com.example.scheduler.service;

import com.example.scheduler.entity.User;

public interface UserService {
    User register(User user);
    User findByEmail(String email);
}
