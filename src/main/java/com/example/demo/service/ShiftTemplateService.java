package com.example.scheduler.service;

import java.util.List;
import com.example.scheduler.entity.ShiftTemplate;

public interface ShiftTemplateService {
    ShiftTemplate create(ShiftTemplate template);
    List<ShiftTemplate> getByDepartment(Long departmentId);
    List<ShiftTemplate> getAll();
}
