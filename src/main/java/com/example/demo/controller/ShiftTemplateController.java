package com.example.demo.controller;

import com.example.demo.dto.ShiftTemplateDto;
import com.example.demo.model.Department;
import com.example.demo.model.ShiftTemplate;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.ShiftTemplateService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
@Tag(name = "Shift Templates Endpoints")
public class ShiftTemplateController {

    private final ShiftTemplateService templateService;
    private final DepartmentService departmentService;

    public ShiftTemplateController(ShiftTemplateService templateService,
                                   DepartmentService departmentService) {
        this.templateService = templateService;
        this.departmentService = departmentService;
    }

    @PostMapping("/department/{departmentId}")
    @Operation(summary = "Create shift template")
    public ResponseEntity<ShiftTemplate> create(
            @PathVariable Long departmentId,
            @RequestBody ShiftTemplateDto dto) {

        Department dept = departmentService.get(departmentId);

        ShiftTemplate template =
                new ShiftTemplate(
                        dto.getTemplateName(),
                        dto.getStartTime(),
                        dto.getEndTime(),
                        dto.getRequiredSkills(),
                        dept
                );

        return ResponseEntity.ok(templateService.create(template));
    }

    @GetMapping("/department/{departmentId}")
    @Operation(summary = "Get templates by department")
    public ResponseEntity<List<ShiftTemplate>> getByDepartment(
            @PathVariable Long departmentId) {
        return ResponseEntity.ok(templateService.getByDepartment(departmentId));
    }
}
