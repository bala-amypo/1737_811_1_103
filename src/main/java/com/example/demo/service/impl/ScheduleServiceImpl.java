package com.example.scheduler.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scheduler.entity.GeneratedShiftSchedule;
import com.example.scheduler.repository.GeneratedShiftScheduleRepository;
import com.example.scheduler.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private GeneratedShiftScheduleRepository repo;

    @Override
    public List<GeneratedShiftSchedule> generate(LocalDate date) {

        // TODO Shift auto allocation logic:
        // 1. fetch shifts assigned on date
        // 2. fetch available employees
        // 3. match skills + availability
        // 4. assign and persist records

        return repo.saveAll(/* finalSchedules */ null);
    }

    @Override
    public List<GeneratedShiftSchedule> getByDate(LocalDate date) {
        return repo.findByDate(date);
    }
}
