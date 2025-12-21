package com.example.demo.controller;

import com.example.demo.entity.ShiftTemplate;
import com.example.demo.service.ShiftTemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class ShiftTemplateController {

    private final ShiftTemplateService shiftTemplateService;

    public ShiftTemplateController(ShiftTemplateService shiftTemplateService) {
        this.shiftTemplateService = shiftTemplateService;
    }

    @PostMapping("/department/{departmentId}")
    public ShiftTemplate create(
            @PathVariable Long departmentId,
            @RequestBody ShiftTemplate shiftTemplate) {

        shiftTemplate.setDepartmentId(departmentId);
        return shiftTemplateService.createShift(shiftTemplate);
    }

    @GetMapping("/department/{departmentId}")
    public List<ShiftTemplate> getByDepartment(@PathVariable Long departmentId) {
        return shiftTemplateService.getShiftsByDepartment(departmentId);
    }

    @GetMapping("/{id}")
    public ShiftTemplate get(@PathVariable Long id) {
        return shiftTemplateService.getShift(id);
    }
}
