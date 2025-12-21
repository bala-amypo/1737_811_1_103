package com.example.scheduler.service.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scheduler.entity.EmployeeAvailability;
import com.example.scheduler.repository.EmployeeAvailabilityRepository;
import com.example.scheduler.service.AvailabilityService;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    @Autowired
    private EmployeeAvailabilityRepository repo;

    @Override
    public EmployeeAvailability create(EmployeeAvailability availability) {
        return repo.save(availability);
    }

    @Override
    public EmployeeAvailability update(EmployeeAvailability availability) {
        return repo.save(availability);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<EmployeeAvailability> getByDate(LocalDate date) {
        return repo.findByDate(date);
    }
}
