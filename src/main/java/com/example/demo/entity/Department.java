package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "departments",
        uniqueConstraints = @UniqueConstraint(columnNames = "name")
)
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    public Department() {}

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // getters and setters omitted for brevity
}
