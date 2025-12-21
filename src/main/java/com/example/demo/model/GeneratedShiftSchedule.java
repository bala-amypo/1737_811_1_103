package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneratedShiftSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate shiftDate;
    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne(optional = false)
    private ShiftTemplate shiftTemplate;

    @ManyToOne(optional = false)
    private Department department;

    @ManyToOne(optional = false)
    private Employee employee;
}
