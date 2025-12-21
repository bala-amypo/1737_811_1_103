package com.example.demo.service.impl;

import com.example.demo.entity.Availability;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.service.AvailabilityService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository availabilityRepository;

    public AvailabilityServiceImpl(AvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    @Override
    public Availability createAvailability(Availability availability) {
        return availabilityRepository.save(availability);
    }

    @Override
    public Availability getAvailability(Long id) {
        return availabilityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Availability not found"));
    }

    @Override
    public List<Availability> getAvailabilityForEmployee(Long employeeId) {
        return availabilityRepository.findByEmployeeId(employeeId);
    }

    @Override
    public List<Availability> getAvailabilityByDate(LocalDate date) {
        return availabilityRepository.findByDate(date);
    }
}
