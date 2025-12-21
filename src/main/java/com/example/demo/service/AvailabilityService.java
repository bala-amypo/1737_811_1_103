package com.example.demo.service;

import com.example.demo.entity.Availability;

import java.time.LocalDate;
import java.util.List;

public interface AvailabilityService {

    Availability createAvailability(Availability availability);

    Availability getAvailability(Long id);

    List<Availability> getAvailabilityForEmployee(Long employeeId);

    List<Availability> getAvailabilityByDate(LocalDate date);
}
