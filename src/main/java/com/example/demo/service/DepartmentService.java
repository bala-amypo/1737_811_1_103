package com.example.scheduler.service;

import java.util.List;
import com.example.scheduler.entity.Department;

public interface DepartmentService {
    Department create(Department department);
    Department get(Long id);
    void delete(Long id);
    List<Department> getAll();
}
