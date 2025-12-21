package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department createDepartment(Department department);

    Department getDepartment(Long id);

    List<Department> getAllDepartments();

    void deleteDepartment(Long id);
}
