package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employees = new ArrayList<>();
    private Long counter = 1L;

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee getEmployee(Long id) {
        return employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(counter++);
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = getEmployee(id);
        if (existing != null) {
            existing.setName(employee.getName());
            existing.setEmail(employee.getEmail());
            existing.setDepartment(employee.getDepartment());
        }
        return existing;
    }

    @Override
    public void deleteEmployee(Long id) {
        employees.removeIf(e -> e.getId().equals(id));
    }
}
