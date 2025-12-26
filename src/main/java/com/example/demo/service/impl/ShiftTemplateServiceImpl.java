package com.example.demo.service.impl;

import com.example.demo.model.ShiftTemplate;
import com.example.demo.repository.ShiftTemplateRepository;
import com.example.demo.service.ShiftTemplateService;
import com.example.demo.util.TimeUtils;

import java.util.List;

public class ShiftTemplateServiceImpl implements ShiftTemplateService {

    private final ShiftTemplateRepository shiftTemplateRepository;

    public ShiftTemplateServiceImpl(ShiftTemplateRepository shiftTemplateRepository) {
        this.shiftTemplateRepository = shiftTemplateRepository;
    }

    @Override
    public ShiftTemplate create(ShiftTemplate template) {

        if (!TimeUtils.isAfter(template.getStartTime(), template.getEndTime())) {
            throw new IllegalArgumentException("endTime must be after startTime");
        }

        shiftTemplateRepository
                .findByTemplateNameAndDepartment_Id(
                        template.getTemplateName(),
                        template.getDepartment().getId())
                .ifPresent(t -> {
                    throw new RuntimeException("Template name must be unique");
                });

        return shiftTemplateRepository.save(template);
    }

    @Override
    public List<ShiftTemplate> getByDepartment(Long departmentId) {
        return shiftTemplateRepository.findByDepartment_Id(departmentId);
    }
}
