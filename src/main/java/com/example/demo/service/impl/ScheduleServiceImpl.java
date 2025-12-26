package com.example.demo.service.impl;

import com.example.demo.model.GeneratedShiftSchedule;
import com.example.demo.service.ScheduleService;

import java.util.ArrayList;
import java.util.List;

public class ScheduleServiceImpl implements ScheduleService {

    private final List<GeneratedShiftSchedule> schedules = new ArrayList<>();

    @Override
    public GeneratedShiftSchedule saveSchedule(GeneratedShiftSchedule schedule) {
        schedules.add(schedule);
        return schedule;
    }

    @Override
    public List<GeneratedShiftSchedule> getAllSchedules() {
        return schedules;
    }
}
