package com.example.demo.service;

import com.example.demo.entity.GeneratedShiftSchedule;
import java.util.List;

public interface ScheduleService {

    List<GeneratedShiftSchedule> getAllSchedules();

    GeneratedShiftSchedule createSchedule(GeneratedShiftSchedule schedule);

    GeneratedShiftSchedule updateSchedule(Long id, GeneratedShiftSchedule schedule);

    void deleteSchedule(Long id);
}
