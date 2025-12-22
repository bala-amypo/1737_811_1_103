package com.example.demo.controller;

import com.example.demo.entity.GeneratedShiftSchedule;
import com.example.demo.service.GeneratedShiftScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generated-shift-schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public GeneratedShiftSchedule create(@RequestBody GeneratedShiftSchedule schedule) {
        return scheduleService.saveSchedule(schedule);
    }

    @GetMapping("/{id}")
    public GeneratedShiftSchedule get(@PathVariable Long id) {
        return scheduleService.getSchedule(id);
    }

    @GetMapping
    public List<GeneratedShiftSchedule> getAll() {
        return scheduleService.getAllSchedules();
    }

    @PutMapping("/{id}")
    public GeneratedShiftSchedule update(@PathVariable Long id, @RequestBody GeneratedShiftSchedule schedule) {
        return scheduleService.updateSchedule(id, schedule);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        scheduleService.deleteSchedule(id);
        return "Generated shift schedule deleted successfully";
    }
}
