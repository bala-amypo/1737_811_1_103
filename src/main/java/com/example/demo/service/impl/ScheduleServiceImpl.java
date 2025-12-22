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
    public GeneratedShiftSchedule saveSchedule(GeneratedShiftSchedule schedule) {
        return repo.save(schedule);
    }

    @Override
    public GeneratedShiftSchedule getSchedule(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));
    }

    @Override
    public List<GeneratedShiftSchedule> getAllSchedules() {
        return repo.findAll();
    }

    @Override
    public GeneratedShiftSchedule updateSchedule(Long id, GeneratedShiftSchedule schedule) {
        GeneratedShiftSchedule existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));

        existing.setDate(schedule.getDate());
        existing.setEmployeeId(schedule.getEmployeeId());
        existing.setShiftTemplateId(schedule.getShiftTemplateId());

        return repo.save(existing);
    }

    @Override
    public void deleteSchedule(Long id) {
        repo.deleteById(id);
    }
}
