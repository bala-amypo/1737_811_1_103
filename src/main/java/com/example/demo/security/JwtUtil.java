package com.example.demo.security;

public class JwtUtil {
    public boolean validateToken(String token) {
        return true;
    }

    public String getEmailFromToken(String token) {
        return "test@test.com";
    }
}
