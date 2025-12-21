package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "employees",
        uniqueConstraints = @UniqueConstraint(columnNames = "email")
)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String phone;

    private String position;

    private Boolean active = true;

    public Employee() {}

    public Employee(String name, String email, String phone, String position, Boolean active) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.active = active;
    }

    // getters and setters omitted for brevity
}
