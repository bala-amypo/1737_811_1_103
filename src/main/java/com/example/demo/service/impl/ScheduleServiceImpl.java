package com.example.demo.service.impl;

import com.example.demo.model.GeneratedShiftSchedule;
import com.example.demo.service.ScheduleService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ScheduleServiceImpl implements ScheduleService {

    private final List<GeneratedShiftSchedule> schedules = new ArrayList<>();

    @Override
    public List<GeneratedShiftSchedule> generateForDate(LocalDate date) {
        GeneratedShiftSchedule s =
                new GeneratedShiftSchedule(1L, "Morning", date);
        schedules.add(s);
        return schedules;
    }

    @Override
    public List<GeneratedShiftSchedule> getByDate(LocalDate date) {
        return schedules.stream()
                .filter(s -> s.getShiftDate().equals(date))
                .collect(Collectors.toList());
    }
}
