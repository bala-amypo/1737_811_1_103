package com.example.demo.model;

import java.util.*;

public class Employee {
    private Long id;
    private String fullName;
    private String email;
    private String role;
    private String skills;
    private int maxWeeklyHours;

    public Employee() {}

    public Employee(String name, String email, String role, String skills, int hrs) {
        this.fullName = name;
        this.email = email;
        this.role = role == null ? "STAFF" : role;
        this.skills = skills;
        this.maxWeeklyHours = hrs;
    }

    public Set<String> getSkills() {
        return skills == null ? Set.of() :
                new HashSet<>(Arrays.asList(skills.split(",")));
    }

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
}
