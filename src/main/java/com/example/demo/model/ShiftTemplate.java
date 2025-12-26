package com.example.demo.model;

import java.time.LocalTime;
import java.util.*;

public class ShiftTemplate {
    private String templateName;
    private LocalTime startTime;
    private LocalTime endTime;
    private String requiredSkills;
    private Department department;

    public ShiftTemplate() {}

    public ShiftTemplate(String n, LocalTime s, LocalTime e, String sk, Department d){
        this.templateName = n;
        this.startTime = s;
        this.endTime = e;
        this.requiredSkills = sk;
        this.department = d;
    }

    public Set<String> getRequiredSkills(){
        return requiredSkills == null ? Set.of()
                : new HashSet<>(Arrays.asList(requiredSkills.split(",")));
    }

    // getters setters
    public String getTemplateName(){ return templateName; }
    public void setTemplateName(String n){ this.templateName = n; }
    public void setStartTime(LocalTime t){ this.startTime = t; }
    public void setEndTime(LocalTime t){ this.endTime = t; }
    public LocalTime getStartTime(){ return startTime; }
    public LocalTime getEndTime(){ return endTime; }
    public Department getDepartment(){ return department; }
}
