package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "shift_templates")
public class ShiftTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long departmentId;

    private String shiftName;

    private LocalTime startTime;

    private LocalTime endTime;

    public ShiftTemplate() {}

    public ShiftTemplate(Long departmentId, String shiftName, LocalTime startTime, LocalTime endTime) {
        this.departmentId = departmentId;
        this.shiftName = shiftName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // getters + setters omitted for brevity
}
