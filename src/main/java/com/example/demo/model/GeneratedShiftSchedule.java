package com.example.demo.model;

import java.time.LocalDate;

public class GeneratedShiftSchedule {

    private Long id;
    private Employee employee;
    private ShiftTemplate shiftTemplate;
    private LocalDate shiftDate;

    public GeneratedShiftSchedule() {}

    public GeneratedShiftSchedule(Employee employee, ShiftTemplate shiftTemplate, LocalDate shiftDate) {
        this.employee = employee;
        this.shiftTemplate = shiftTemplate;
        this.shiftDate = shiftDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ShiftTemplate getShiftTemplate() {
        return shiftTemplate;
    }

    public void setShiftTemplate(ShiftTemplate shiftTemplate) {
        this.shiftTemplate = shiftTemplate;
    }

    public LocalDate getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(LocalDate shiftDate) {
        this.shiftDate = shiftDate;
    }
}
