package com.example.demo.service;

import com.example.demo.model.GeneratedShiftSchedule;

import java.time.LocalDate;
import java.util.List;

public interface GeneratedShiftScheduleService {

    GeneratedShiftSchedule save(GeneratedShiftSchedule schedule);

    List<GeneratedShiftSchedule> getByDate(LocalDate date);
}
