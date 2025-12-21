package com.example.demo.service.impl;

import com.example.demo.model.GeneratedShiftSchedule;
import com.example.demo.model.ShiftTemplate;
import com.example.demo.repository.GeneratedShiftScheduleRepository;
import com.example.demo.repository.ShiftTemplateRepository;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final GeneratedShiftScheduleRepository scheduleRepo;
    private final ShiftTemplateRepository templateRepo;
    private final AvailabilityRepository availabilityRepo;

    public ScheduleServiceImpl(
            GeneratedShiftScheduleRepository scheduleRepo,
            ShiftTemplateRepository templateRepo,
            AvailabilityRepository availabilityRepo
    ){
        this.scheduleRepo = scheduleRepo;
        this.templateRepo = templateRepo;
        this.availabilityRepo = availabilityRepo;
    }

    public List<GeneratedShiftSchedule> generateForDate(LocalDate date){

        List<ShiftTemplate> templates = templateRepo.findAll();

        List<GeneratedShiftSchedule> list = new ArrayList<>();

        for(ShiftTemplate t : templates){

            GeneratedShiftSchedule gs = new GeneratedShiftSchedule();
            gs.setShiftDate(date);
            gs.setDepartment(t.getDepartment());
            gs.setShiftTemplate(t);
            gs.setStartTime(t.getStartTime());
            gs.setEndTime(t.getEndTime());

            scheduleRepo.save(gs);
            list.add(gs);
        }

        return list;
    }

    public List<GeneratedShiftSchedule> getByDate(LocalDate date){
        return scheduleRepo.findByShiftDate(date);
    }
}
