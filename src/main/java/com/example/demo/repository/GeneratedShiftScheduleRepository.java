package com.example.demo.repository;

import com.example.demo.model.GeneratedShiftSchedule;
import java.time.LocalDate;
import java.util.*;

public interface GeneratedShiftScheduleRepository {
    List<GeneratedShiftSchedule> findByShiftDate(LocalDate date);
    GeneratedShiftSchedule save(GeneratedShiftSchedule g);
}
