package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @PostMapping
    public String createDepartment() {
        return "Department created";
    }

    @GetMapping
    public String getAllDepartments() {
        return "All departments";
    }

    @GetMapping("/{id}")
    public String getDepartment(@PathVariable Long id) {
        return "Department " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        return "Department deleted";
    }
}

