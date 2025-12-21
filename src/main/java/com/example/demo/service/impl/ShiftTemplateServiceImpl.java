package com.example.demo.service.impl;

import com.example.demo.entity.ShiftTemplate;
import com.example.demo.repository.ShiftTemplateRepository;
import com.example.demo.service.ShiftTemplateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftTemplateServiceImpl implements ShiftTemplateService {

    private final ShiftTemplateRepository shiftTemplateRepository;

    public ShiftTemplateServiceImpl(ShiftTemplateRepository shiftTemplateRepository) {
        this.shiftTemplateRepository = shiftTemplateRepository;
    }

    @Override
    public ShiftTemplate createShift(ShiftTemplate shiftTemplate) {

        if (shiftTemplate.getStartTime().isAfter(shiftTemplate.getEndTime())) {
            throw new RuntimeException("Start time must be before end time");
        }

        return shiftTemplateRepository.save(shiftTemplate);
    }

    @Override
    public ShiftTemplate getShift(Long id) {
        return shiftTemplateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Shift template not found"));
    }

    @Override
    public List<ShiftTemplate> getShiftsByDepartment(Long departmentId) {
        return shiftTemplateRepository.findByDepartmentId(departmentId);
    }
}
