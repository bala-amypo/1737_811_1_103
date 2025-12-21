package com.example.demo.controller;

import com.example.demo.model.Availability;
import com.example.demo.service.AvailabilityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/availability")
public class AvailabilityController {

    private final AvailabilityService availabilityService;

    public AvailabilityController(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    @PostMapping
    public ResponseEntity<Availability> create(@RequestBody Availability availability) {
        return ResponseEntity.ok(availabilityService.save(availability));
    }

    @GetMapping
    public ResponseEntity<List<Availability>> getAll() {
        return ResponseEntity.ok(availabilityService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        availabilityService.delete(id);
        return ResponseEntity.ok("Availability removed");
    }
}
