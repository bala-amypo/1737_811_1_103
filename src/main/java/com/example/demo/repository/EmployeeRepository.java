package com.example.demo.repository;

import com.example.demo.model.Employee;
import java.util.*;

public interface EmployeeRepository {
    Optional<Employee> findById(Long id);
    Optional<Employee> findByEmail(String email);
    boolean existsByEmail(String email);
    List<Employee> findAll();
    Employee save(Employee e);
    void delete(Employee e);
}
