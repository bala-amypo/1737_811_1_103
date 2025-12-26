package com.example.demo.model;

import java.util.*;

public class Department {
    private Long id;
    private String name;
    private String description;
    private String requiredSkills;

    public Department() {}
    public Department(String n, String d, String s) {
        this.name = n;
        this.description = d;
        this.requiredSkills = s;
    }

    public Set<String> getRequiredSkills() {
        return requiredSkills == null ? Set.of()
                : new HashSet<>(Arrays.asList(requiredSkills.split(",")));
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public String getDescription(){ return description; }
    public void setDescription(String d){ this.description = d; }
}
