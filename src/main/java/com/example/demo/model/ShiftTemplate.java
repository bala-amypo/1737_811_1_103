package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "shift_templates")
public class ShiftTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String templateName;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @Column
    private String requiredSkills;

    @ManyToOne(optional = false)
    private Department department;

    public ShiftTemplate() {
    }

    public ShiftTemplate(String templateName, LocalTime startTime, LocalTime endTime,
                         String requiredSkills, Department department) {
        this.templateName = templateName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.requiredSkills = requiredSkills;
        this.department = department;
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getTemplateName() {
        return templateName;
    }
 
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
 
    public LocalTime getStartTime() {
        return startTime;
    }
 
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
 
    public LocalTime getEndTime() {
        return endTime;
    }
 
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
 
    public String getRequiredSkills() {
        return requiredSkills;
    }
 
    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }
 
    public Department getDepartment() {
        return department;
    }
 
    public void setDepartment(Department department) {
        this.department = department;
    }
}
