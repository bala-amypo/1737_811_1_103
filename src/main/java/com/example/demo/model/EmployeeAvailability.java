package com.example.demo.model;

import java.time.LocalDate;

public class EmployeeAvailability {
    private Long id;
    private Employee employee;
    private LocalDate availableDate;
    private boolean available;

    public EmployeeAvailability(){}
    public EmployeeAvailability(Employee e, LocalDate d, boolean a){
        this.employee = e;
        this.availableDate = d;
        this.available = a;
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public Employee getEmployee(){ return employee; }
    public LocalDate getAvailableDate(){ return availableDate; }
    public boolean getAvailable(){ return available; }
    public void setAvailable(boolean b){ this.available = b; }
}
