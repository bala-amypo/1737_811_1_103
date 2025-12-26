package com.example.demo.model;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShiftTemplate {

    private Long id;
    private String templateName;
    private LocalTime startTime;
    private LocalTime endTime;
    private String requiredSkills;
    private Department department;

    // REQUIRED: No-arg constructor
    public ShiftTemplate() {}

    // REQUIRED: Constructor used in tests
    public ShiftTemplate(String templateName,
                         LocalTime startTime,
                         LocalTime endTime,
                         String requiredSkills,
                         Department department) {
        this.templateName = templateName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.requiredSkills = requiredSkills;
        this.department = department;
    }

    // ---------------- GETTERS & SETTERS ----------------

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

    // ---------------- HELPER METHODS ----------------

    public Set<String> getRequiredSkillsSet() {
        if (requiredSkills == null || requiredSkills.isEmpty()) {
            return new HashSet<>();
        }
        return new HashSet<>(Arrays.asList(requiredSkills.split(",")));
    }
}
