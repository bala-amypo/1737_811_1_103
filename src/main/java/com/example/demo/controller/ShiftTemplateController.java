package com.example.demo.controller;

import com.example.demo.entity.ShiftTemplate;
import com.example.demo.service.ShiftTemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shift-templates")
public class ShiftTemplateController {

    private final ShiftTemplateService shiftTemplateService;

    public ShiftTemplateController(ShiftTemplateService shiftTemplateService) {
        this.shiftTemplateService = shiftTemplateService;
    }

    @PostMapping
    public ShiftTemplate create(@RequestBody ShiftTemplate shiftTemplate) {
        return shiftTemplateService.saveShiftTemplate(shiftTemplate);
    }

    @GetMapping("/{id}")
    public ShiftTemplate get(@PathVariable Long id) {
        return shiftTemplateService.getShiftTemplate(id);
    }

    @GetMapping
    public List<ShiftTemplate> getAll() {
        return shiftTemplateService.getAllShiftTemplates();
    }

    @PutMapping("/{id}")
    public ShiftTemplate update(@PathVariable Long id, @RequestBody ShiftTemplate shiftTemplate) {
        return shiftTemplateService.updateShiftTemplate(id, shiftTemplate);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        shiftTemplateService.deleteShiftTemplate(id);
        return "Shift template deleted successfully";
    }
}
