package com.example.demo.service.impl;

import com.example.demo.model.GeneratedShiftSchedule;
import com.example.demo.repository.GeneratedShiftScheduleRepository;
import com.example.demo.service.GeneratedShiftScheduleService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class GeneratedShiftScheduleServiceImpl implements GeneratedShiftScheduleService {

    private final GeneratedShiftScheduleRepository generatedShiftScheduleRepository;

    public GeneratedShiftScheduleServiceImpl(GeneratedShiftScheduleRepository generatedShiftScheduleRepository) {
        this.generatedShiftScheduleRepository = generatedShiftScheduleRepository;
    }

    @Override
    public GeneratedShiftSchedule save(GeneratedShiftSchedule schedule) {
        return generatedShiftScheduleRepository.save(schedule);
    }

    @Override
    public List<GeneratedShiftSchedule> getByDate(LocalDate date) {
        return generatedShiftScheduleRepository.findByShiftDate(date);
    }
}
