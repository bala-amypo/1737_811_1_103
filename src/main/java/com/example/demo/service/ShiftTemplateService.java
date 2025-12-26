package com.example.demo.service;

import com.example.demo.entity.ShiftTemplate;
import java.util.List;

public interface ShiftTemplateService {

    ShiftTemplate saveShiftTemplate(ShiftTemplate shiftTemplate);
    ShiftTemplate getShiftTemplate(Long id);
    List<ShiftTemplate> getAllShiftTemplates();
    ShiftTemplate updateShiftTemplate(Long id, ShiftTemplate shiftTemplate);
    void deleteShiftTemplate(Long id);
}
