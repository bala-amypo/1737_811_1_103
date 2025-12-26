package com.example.demo.repository;

import com.example.demo.model.Department;
import java.util.*;

public interface DepartmentRepository {
    Optional<Department> findById(Long id);
    boolean existsByName(String name);
    List<Department> findAll();
    Department save(Department d);
    void delete(Department d);
}
