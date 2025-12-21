package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "generated_shift_schedules")
public class GeneratedShiftSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate shiftDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private Long departmentId;

    private Long shiftTemplateId;

    private Long employeeId;

    public GeneratedShiftSchedule() {}

    public GeneratedShiftSchedule(LocalDate shiftDate, LocalTime startTime, LocalTime endTime,
                                  Long departmentId, Long shiftTemplateId, Long employeeId) {
        this.shiftDate = shiftDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.departmentId = departmentId;
        this.shiftTemplateId = shiftTemplateId;
        this.employeeId = employeeId;
    }

    // getters & setters omitted for brevity
}
