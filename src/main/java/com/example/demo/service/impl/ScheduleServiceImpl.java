package com.example.demo.service.impl;

import com.example.demo.entity.GeneratedShiftSchedule;
import com.example.demo.repository.GeneratedShiftScheduleRepository;
import com.example.demo.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final GeneratedShiftScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(GeneratedShiftScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public GeneratedShiftSchedule saveSchedule(GeneratedShiftSchedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public GeneratedShiftSchedule getSchedule(Long id) {
        return scheduleRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<GeneratedShiftSchedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public GeneratedShiftSchedule updateSchedule(Long id, GeneratedShiftSchedule updated) {
        return scheduleRepository.findById(id)
                .map(existing -> {
                    existing.setEmployeeId(updated.getEmployeeId());
                    existing.setShiftTemplateId(updated.getShiftTemplateId());
                    existing.setDate(updated.getDate());
                    return scheduleRepository.save(existing);
                }).orElse(null);
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
