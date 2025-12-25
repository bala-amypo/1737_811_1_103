package com.example.demo.service;

import com.example.demo.entity.GeneratedShiftSchedule;
import java.util.List;

public interface GeneratedShiftScheduleService {

    List<GeneratedShiftSchedule> getSchedules();

    GeneratedShiftSchedule saveSchedule(GeneratedShiftSchedule schedule);
}