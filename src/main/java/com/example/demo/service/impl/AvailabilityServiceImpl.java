package com.example.demo.service.impl;

import com.example.demo.model.EmployeeAvailability;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.AvailabilityService;

import java.time.LocalDate;
import java.util.List;

public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository repo;
    private final EmployeeRepository empRepo;

    public AvailabilityServiceImpl(AvailabilityRepository r,
                                   EmployeeRepository e) {
        this.repo = r;
        this.empRepo = e;
    }

    @Override
    public EmployeeAvailability create(EmployeeAvailability a) {
        if (a.getEmployee() != null && a.getAvailableDate() != null) {
            if (repo.findByEmployee_IdAndAvailableDate(
                    a.getEmployee().getId(),
                    a.getAvailableDate()).isPresent()) {
                throw new RuntimeException("exists");
            }
        }
        return repo.save(a);
    }

    @Override
    public EmployeeAvailability update(Long id, EmployeeAvailability a) {
        EmployeeAvailability existing =
                repo.findById(id).orElseThrow();
        existing.setAvailable(a.getAvailable());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        EmployeeAvailability a = repo.findById(id).orElseThrow();
        repo.delete(a);
    }

    @Override
    public List<EmployeeAvailability> getByDate(LocalDate d) {
        return repo.findByAvailableDateAndAvailable(d, true);
    }
}
