package com.example.demo.service.impl;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentServiceImpl(DepartmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Department create(Department d) {
        if (repo.existsByName(d.getName()))
            throw new RuntimeException("exists");
        return repo.save(d);
    }

    @Override
    public Department get(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<Department> getAll() {
        return repo.findAll();
    }

    @Override
    public void delete(Long id) {
        Department d = get(id);
        repo.delete(d);
    }
}
