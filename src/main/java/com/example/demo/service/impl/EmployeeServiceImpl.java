package com.example.demo.service.impl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new RuntimeException("Email must be unique");
        }

        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, Employee updated) {

        Employee existing = getEmployee(id);

        if (!existing.getEmail().equals(updated.getEmail())
                && employeeRepository.existsByEmail(updated.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        existing.setName(updated.getName());
        existing.setEmail(updated.getEmail());
        existing.setPhone(updated.getPhone());
        existing.setPosition(updated.getPosition());
        existing.setActive(updated.getActive());

        return employeeRepository.save(existing);
    }

    @Override
    public void deleteEmployee(Long id) {
        getEmployee(id);
        employeeRepository.deleteById(id);
    }
}
