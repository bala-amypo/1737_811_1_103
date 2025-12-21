package com.example.demo.repository;

import com.example.demo.entity.Availability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {

    List<Availability> findByEmployeeId(Long employeeId);

    List<Availability> findByDate(LocalDate date);

}
