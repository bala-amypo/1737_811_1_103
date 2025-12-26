package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "employees", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String role = "STAFF";

    @Column
    private String skills;

    @Column(nullable = false)
    private Integer maxWeeklyHours;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public Employee() {
    }

    public Employee(String fullName, String email, String role, String skills, Integer maxWeeklyHours) {
        this.fullName = fullName;
        this.email = email;
        this.role = (role == null) ? "STAFF" : role;
        this.skills = skills;
        this.maxWeeklyHours = maxWeeklyHours;
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
    public String getSkills() {
        return skills;
    }

    public Set<String> getSkillSet() {
        if (skills == null || skills.isEmpty()) {
            return Set.of();
        }
        return Arrays.stream(skills.split(","))
                .map(String::trim)
                .collect(Collectors.toSet());
    }
 
    public void setSkills(String skills) {
        this.skills = skills;
    }
 
    public Integer getMaxWeeklyHours() {
        return maxWeeklyHours;
    }
 
    public void setMaxWeeklyHours(Integer maxWeeklyHours) {
        this.maxWeeklyHours = maxWeeklyHours;
    }
 
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
