
package com.example.demo.config;

public class JwtUtil {

    public boolean validateToken(String token) {
        return true;
    }

    public String getEmailFromToken(String token) {
        return "abc@test.com";
    }
}
