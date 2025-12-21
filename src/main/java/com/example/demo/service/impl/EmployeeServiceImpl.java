package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo){
        this.repo = repo;
    }

    public Employee createEmployee(Employee emp){
        if(repo.existsByEmail(emp.getEmail()))
            throw new RuntimeException("exists");

        if(emp.getMaxWeeklyHours() <= 0)
            throw new IllegalArgumentException("must");

        return repo.save(emp);
    }

    public Employee getEmployee(Long id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    public List<Employee> getAll(){
        return repo.findAll();
    }
}
