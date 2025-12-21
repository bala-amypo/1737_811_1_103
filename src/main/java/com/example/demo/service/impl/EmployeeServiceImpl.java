package com.example.scheduler.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scheduler.entity.Employee;
import com.example.scheduler.repository.EmployeeRepository;
import com.example.scheduler.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee createEmployee(Employee e) {
        if (repo.existsByEmail(e.getEmail())) {
            throw new RuntimeException("Duplicate email!");
        }
        return repo.save(e);
    }

    @Override
    public Employee getEmployee(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public Employee update(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }
}
