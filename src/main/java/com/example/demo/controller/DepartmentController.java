package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public ResponseEntity<List<Department>> list() {
        return ResponseEntity.ok(departmentService.getAll());
    }

    public ResponseEntity<Department> get(Long id) {
        return ResponseEntity.ok(departmentService.get(id));
    }

    public ResponseEntity<Department> create(Department d) {
        return ResponseEntity.ok(departmentService.create(d));
    }

    public ResponseEntity<String> delete(Long id) {
        departmentService.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}
