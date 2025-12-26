package com.example.demo.repository;

import com.example.demo.model.EmployeeAvailability;
import java.time.LocalDate;
import java.util.*;

public interface AvailabilityRepository {
    Optional<EmployeeAvailability> findById(Long id);
    Optional<EmployeeAvailability> findByEmployee_IdAndAvailableDate(Long empId, LocalDate date);
    List<EmployeeAvailability> findByAvailableDateAndAvailable(LocalDate date, boolean available);
    List<EmployeeAvailability> findByEmployee_Id(Long empId);
    EmployeeAvailability save(EmployeeAvailability a);
    void delete(EmployeeAvailability a);
}
