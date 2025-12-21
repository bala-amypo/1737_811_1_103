package com.example.demo.service.impl;

import com.example.demo.model.EmployeeAvailability;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.service.AvailabilityService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository repo;

    public AvailabilityServiceImpl(AvailabilityRepository repo){
        this.repo = repo;
    }

    public EmployeeAvailability create(EmployeeAvailability avail){
        repo.findByEmployee_IdAndAvailableDate(
                avail.getEmployee().getId(),
                avail.getAvailableDate()
        ).ifPresent(x -> {
            throw new RuntimeException("exists");
        });

        return repo.save(avail);
    }

    public List<EmployeeAvailability> getByDate(LocalDate date){
        return repo.findByAvailableDateAndAvailable(date, true);
    }
}
