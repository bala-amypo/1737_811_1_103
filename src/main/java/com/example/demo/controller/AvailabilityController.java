package com.example.demo.controller;

import com.example.demo.entity.Availability;
import com.example.demo.service.AvailabilityService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/availability")
public class AvailabilityController {

    private final AvailabilityService availabilityService;

    public AvailabilityController(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    @PostMapping("/{employeeId}")
    public Availability create(
            @PathVariable Long employeeId,
            @RequestBody Availability availability) {

        availability.setEmployeeId(employeeId);
        return availabilityService.createAvailability(availability);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Availability> getForEmployee(@PathVariable Long employeeId) {
        return availabilityService.getAvailabilityForEmployee(employeeId);
    }

    @GetMapping("/{id}")
    public Availability get(@PathVariable Long id) {
        return availabilityService.getAvailability(id);
    }

    @GetMapping("/date/{date}")
    public List<Availability> getByDate(@PathVariable String date) {
        return availabilityService.getAvailabilityByDate(LocalDate.parse(date));
    }
}
