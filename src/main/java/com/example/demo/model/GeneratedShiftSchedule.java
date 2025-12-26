package com.example.demo.model;

import java.time.LocalDate;

public class GeneratedShiftSchedule {

    private Long id;
    private Long employeeId;
    private String shiftName;
    private LocalDate shiftDate;

    public GeneratedShiftSchedule() {}

    public GeneratedShiftSchedule(Long employeeId, String shiftName, LocalDate shiftDate) {
        this.employeeId = employeeId;
        this.shiftName = shiftName;
        this.shiftDate = shiftDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public LocalDate getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(LocalDate shiftDate) {
        this.shiftDate = shiftDate;
    }
}
