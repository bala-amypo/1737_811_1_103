package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public ResponseEntity<List<Employee>> list() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    public ResponseEntity<Employee> get(Long id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }

    public ResponseEntity<Employee> create(Employee e) {
        return ResponseEntity.ok(employeeService.createEmployee(e));
    }

    public ResponseEntity<Employee> update(Long id, Employee e) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, e));
    }

    public ResponseEntity<String> delete(Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Deleted");
    }
}
