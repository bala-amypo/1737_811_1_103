package com.example.demo.service;

import com.example.demo.model.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee getEmployee(Long id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
