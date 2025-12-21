package com.example.demo.controller;

import com.example.demo.entity.ShiftTemplate;
import com.example.demo.service.ShiftTemplateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shift-templates")
public class ShiftTemplateController {

    private final ShiftTemplateService shiftTemplateService;

    public ShiftTemplateController(ShiftTemplateService shiftTemplateService) {
        this.shiftTemplateService = shiftTemplateService;
    }

    @PostMapping
    public ResponseEntity<ShiftTemplate> create(@RequestBody ShiftTemplate shiftTemplate) {
        return ResponseEntity.ok(shiftTemplateService.save(shiftTemplate));
    }

    @GetMapping
    public ResponseEntity<List<ShiftTemplate>> getAll() {
        return ResponseEntity.ok(shiftTemplateService.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShiftTemplate> update(
            @PathVariable Long id,
            @RequestBody ShiftTemplate shiftTemplate) {
        return ResponseEntity.ok(shiftTemplateService.update(id, shiftTemplate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        shiftTemplateService.delete(id);
        return ResponseEntity.ok("Shift template deleted");
    }
}
