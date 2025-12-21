package com.example.scheduler.service;

import java.util.List;
import com.example.scheduler.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployee(Long id);
    Employee update(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> getAll();
}
