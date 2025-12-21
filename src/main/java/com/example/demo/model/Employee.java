package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String fullName;

    @Column(nullable=false, unique=true)
    private String email;

    private String role = "STAFF";

    private String skills;

    @Column(nullable=false)
    private Integer maxWeeklyHours;

    private LocalDateTime createdAt = LocalDateTime.now();
}
