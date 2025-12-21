package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @PostMapping("/register")
    public String registerEmployee() {
        return "Employee registered";
    }

    @GetMapping
    public String getAllEmployees() {
        return "All employees";
    }

    @GetMapping("/{id}")
    public String getEmployee(@PathVariable Long id) {
        return "Employee " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return "Employee deleted";
    }
}

