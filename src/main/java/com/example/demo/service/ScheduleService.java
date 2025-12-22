package com.example.demo.service;

import com.example.demo.entity.GeneratedShiftSchedule;
import java.util.List;

public interface ScheduleService {

    GeneratedShiftSchedule saveSchedule(GeneratedShiftSchedule schedule);

    GeneratedShiftSchedule getSchedule(Long id);

    List<GeneratedShiftSchedule> getAllSchedules();

    GeneratedShiftSchedule updateSchedule(Long id, GeneratedShiftSchedule schedule);

    void deleteSchedule(Long id);
}
