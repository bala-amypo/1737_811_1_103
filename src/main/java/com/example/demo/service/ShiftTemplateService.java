package com.example.demo.service;

import com.example.demo.entity.ShiftTemplate;

import java.util.List;

public interface ShiftTemplateService {

    ShiftTemplate createShift(ShiftTemplate shiftTemplate);

    ShiftTemplate getShift(Long id);

    List<ShiftTemplate> getShiftsByDepartment(Long departmentId);
}
