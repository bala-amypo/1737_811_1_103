package com.example.demo.service;

import com.example.demo.entity.GeneratedShiftSchedule;
import java.util.List;

public interface ScheduleService {

    GeneratedShiftSchedule saveSchedule(GeneratedShiftSchedule schedule);

    List<GeneratedShiftSchedule> getAllSchedules();
}
