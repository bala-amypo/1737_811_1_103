package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/availability")
public class AvailabilityController {

    @PostMapping("/employee/{employeeId}")
    public String setAvailability(@PathVariable Long employeeId) {
        return "Availability set";
    }

    @GetMapping("/employee/{employeeId}")
    public String getAvailabilityByEmployee(@PathVariable Long employeeId) {
        return "Employee availability";
    }

    @GetMapping("/{availabilityId}")
    public String getAvailability(@PathVariable Long availabilityId) {
        return "Specific availability";
    }

    @GetMapping("/date/{date}")
    public String getAvailabilityByDate(@PathVariable String date) {
        return "Availability by date";
    }
}
