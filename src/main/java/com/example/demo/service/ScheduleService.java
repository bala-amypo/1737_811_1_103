package com.example.demo.service;

import com.example.demo.model.GeneratedShiftSchedule;
import java.util.List;

public interface ScheduleService {

    GeneratedShiftSchedule saveSchedule(GeneratedShiftSchedule schedule);

    List<GeneratedShiftSchedule> getAllSchedules();
}
