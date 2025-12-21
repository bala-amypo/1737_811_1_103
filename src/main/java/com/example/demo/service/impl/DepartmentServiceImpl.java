package com.example.scheduler.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scheduler.entity.Department;
import com.example.scheduler.repository.DepartmentRepository;
import com.example.scheduler.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    @Override
    public Department create(Department d) {
        if (repo.existsByName(d.getName())) {
            throw new RuntimeException("Duplicate department!");
        }
        return repo.save(d);
    }

    @Override
    public Department get(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Department> getAll() {
        return repo.findAll();
    }
}
