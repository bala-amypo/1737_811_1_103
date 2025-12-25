package com.example.demo.controller;

import com.example.demo.model.Availability;
import com.example.demo.service.AvailabilityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/availability")
public class AvailabilityController {

    private final AvailabilityService availabilityService;

    public AvailabilityController(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    @PostMapping
    public Availability create(@RequestBody Availability availability) {
        return availabilityService.saveAvailability(availability);
    }

    @GetMapping("/{id}")
    public Availability get(@PathVariable Long id) {
        return availabilityService.getAvailability(id);
    }

    @GetMapping
    public List<Availability> getAll() {
        return availabilityService.getAllAvailability();
    }

    @PutMapping("/{id}")
    public Availability update(@PathVariable Long id, @RequestBody Availability availability) {
        return availabilityService.updateAvailability(id, availability);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        availabilityService.deleteAvailability(id);
        return "Availability deleted successfully";
    }
}
