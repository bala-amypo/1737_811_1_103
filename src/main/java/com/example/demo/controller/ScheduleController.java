package com.example.demo.controller;

import com.example.demo.model.GeneratedShiftSchedule;
import com.example.demo.service.GeneratedShiftScheduleService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class GeneratedShiftScheduleController {

    private final GeneratedShiftScheduleService generatedShiftScheduleService;

    public GeneratedShiftScheduleController(GeneratedShiftScheduleService generatedShiftScheduleService) {
        this.generatedShiftScheduleService = generatedShiftScheduleService;
    }

    @PostMapping
    public GeneratedShiftSchedule create(@RequestBody GeneratedShiftSchedule schedule) {
        return generatedShiftScheduleService.save(schedule);
    }

    @GetMapping("/date/{date}")
    public List<GeneratedShiftSchedule> getSchedule(@PathVariable LocalDate date) {
        return generatedShiftScheduleService.getByDate(date);
    }
}
