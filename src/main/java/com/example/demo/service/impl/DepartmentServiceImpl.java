package com.example.demo.service.impl;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentServiceImpl(DepartmentRepository repo){
        this.repo = repo;
    }

    public Department create(Department dep){
        if(repo.existsByName(dep.getName()))
            throw new RuntimeException("exists");

        return repo.save(dep);
    }

    public Department get(Long id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    public List<Department> getAll(){
        return repo.findAll();
    }
}
