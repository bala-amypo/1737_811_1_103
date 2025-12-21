package com.example.scheduler.service;

import java.time.LocalDate;
import java.util.List;

import com.example.scheduler.entity.GeneratedShiftSchedule;

public interface ScheduleService {
    List<GeneratedShiftSchedule> generate(LocalDate date);
    List<GeneratedShiftSchedule> getByDate(LocalDate date);
}
