package com.example.demo.service;

import com.example.demo.entity.Availability;
import java.util.List;

public interface AvailabilityService {

    Availability saveAvailability(Availability availability);
    Availability getAvailability(Long id);
    List<Availability> getAllAvailability();
    Availability updateAvailability(Long id, Availability availability);
    void deleteAvailability(Long id);
}
