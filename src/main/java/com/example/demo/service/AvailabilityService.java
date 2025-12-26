package com.example.demo.service;

import com.example.demo.model.EmployeeAvailability;
import java.time.LocalDate;
import java.util.List;

public interface AvailabilityService {
    EmployeeAvailability create(EmployeeAvailability a);
    EmployeeAvailability update(Long id, EmployeeAvailability a);
    void delete(Long id);
    List<EmployeeAvailability> getByDate(LocalDate d);
}
