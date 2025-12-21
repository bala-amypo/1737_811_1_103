package com.example.scheduler.service;

import java.time.LocalDate;
import java.util.List;
import com.example.scheduler.entity.EmployeeAvailability;

public interface AvailabilityService {
    EmployeeAvailability create(EmployeeAvailability availability);
    EmployeeAvailability update(EmployeeAvailability availability);
    void delete(Long id);
    List<EmployeeAvailability> getByDate(LocalDate date);
}
