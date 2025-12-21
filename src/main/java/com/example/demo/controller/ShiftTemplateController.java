package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/templates")
public class ShiftTemplateController {

    @PostMapping("/department/{departmentId}")
    public String createShiftTemplate(@PathVariable Long departmentId) {
        return "Shift template created";
    }

    @GetMapping("/department/{departmentId}")
    public String getTemplatesByDepartment(@PathVariable Long departmentId) {
        return "Templates by department";
    }

    @GetMapping("/{id}")
    public String getTemplate(@PathVariable Long id) {
        return "Template " + id;
    }
}
