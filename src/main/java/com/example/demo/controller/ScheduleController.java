package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    @PostMapping("/generate/{date}")
    public String generateSchedule(@PathVariable String date) {
        return "Schedule generated";
    }

    @GetMapping("/{date}")
    public String getScheduleByDate(@PathVariable String date) {
        return "Schedule for date";
    }
}
