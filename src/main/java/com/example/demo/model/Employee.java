package com.example.demo.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Employee {

    private Long id;
    private String fullName;
    private String email;
    private String role;
    private String skills;
    private int maxHours;

    // REQUIRED: No-arg constructor
    public Employee() {}

    // REQUIRED: Constructor used by tests
    public Employee(String fullName, String email, String role, String skills, int maxHours) {
        this.fullName = fullName;
        this.email = email;
        this.role = (role == null || role.isEmpty()) ? "STAFF" : role;
        this.skills = skills;
        this.maxHours = maxHours;
    }

    // ---------------- GETTERS & SETTERS ----------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role == null ? "STAFF" : role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(int maxHours) {
        this.maxHours = maxHours;
    }

    // ---------------- HELPER METHODS ----------------

    // REQUIRED BY TESTS: skill parsing
    public Set<String> getSkillsSet() {
        if (skills == null || skills.isEmpty()) return new HashSet<>();
        return new HashSet<>(Arrays.asList(skills.split(",")));
    }

    // TESTS CALL e.getSkills().contains("JAVA")
    public String getSkillsAsString() {
        return skills;
    }

    // Alias for test compatibility
    public String getSkills() {
        return skills;
    }
}
