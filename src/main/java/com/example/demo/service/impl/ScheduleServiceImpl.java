package com.example.demo.service.impl;

import com.example.demo.entity.GeneratedShiftSchedule;
import com.example.demo.repository.GeneratedShiftScheduleRepository;
import com.example.demo.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final GeneratedShiftScheduleRepository repo;

    public ScheduleServiceImpl(GeneratedShiftScheduleRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<GeneratedShiftSchedule> getAllSchedules() {
        return repo.findAll();
    }

    @Override
    public GeneratedShiftSchedule createSchedule(GeneratedShiftSchedule schedule) {
        return repo.save(schedule);
    }

    @Override
    public GeneratedShiftSchedule updateSchedule(Long id, GeneratedShiftSchedule schedule) {
        GeneratedShiftSchedule existing = repo.findById(id).orElseThrow();
        existing.setEmployeeId(schedule.getEmployeeId());
        existing.setShiftTemplateId(schedule.getShiftTemplateId());
        existing.setDate(schedule.getDate());
        return repo.save(existing);
    }

    @Override
    public void deleteSchedule(Long id) {
        repo.deleteById(id);
    }
}
