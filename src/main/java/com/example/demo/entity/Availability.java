package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "availability")
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId; // stored directly instead of relation

    private LocalDate date;

    private Boolean available;

    public Availability() {}

    public Availability(Long employeeId, LocalDate date, Boolean available) {
        this.employeeId = employeeId;
        this.date = date;
        this.available = available;
    }

    // getters and setters omitted for brevity
}
