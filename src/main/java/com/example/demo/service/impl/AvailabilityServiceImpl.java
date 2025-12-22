package com.example.demo.service.impl;

import com.example.demo.entity.Availability;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.service.AvailabilityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository availabilityRepository;

    public AvailabilityServiceImpl(AvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    @Override
    public Availability saveAvailability(Availability availability) {
        return availabilityRepository.save(availability);
    }

    @Override
    public Availability getAvailability(Long id) {
        return availabilityRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Availability> getAllAvailability() {
        return availabilityRepository.findAll();
    }

    @Override
    public Availability updateAvailability(Long id, Availability updated) {
        return availabilityRepository.findById(id)
                .map(existing -> {
                    existing.setEmployeeId(updated.getEmployeeId());
                    existing.setDay(updated.getDay());
                    existing.setStartTime(updated.getStartTime());
                    existing.setEndTime(updated.getEndTime());
                    return availabilityRepository.save(existing);
                }).orElse(null);
    }

    @Override
    public void deleteAvailability(Long id) {
        availabilityRepository.deleteById(id);
    }
}
