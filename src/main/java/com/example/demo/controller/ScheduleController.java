package com.example.demo.controller;

import com.example.demo.model.Schedule;
import com.example.demo.service.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public ResponseEntity<Schedule> create(@RequestBody Schedule schedule) {
        return ResponseEntity.ok(scheduleService.save(schedule));
    }

    @GetMapping
    public ResponseEntity<List<Schedule>> getAll() {
        return ResponseEntity.ok(scheduleService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Schedule> getById(@PathVariable Long id) {
        return ResponseEntity.ok(scheduleService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        scheduleService.delete(id);
        return ResponseEntity.ok("Schedule deleted");
    }
}
