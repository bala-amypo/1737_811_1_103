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
    public ShiftTemplate saveShiftTemplate(ShiftTemplate shiftTemplate) {
        return shiftTemplateRepository.save(shiftTemplate);
    }

    @Override
    public ShiftTemplate getShiftTemplate(Long id) {
        return shiftTemplateRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<ShiftTemplate> getAllShiftTemplates() {
        return shiftTemplateRepository.findAll();
    }

    @Override
    public ShiftTemplate updateShiftTemplate(Long id, ShiftTemplate updated) {
        return shiftTemplateRepository.findById(id)
                .map(existing -> {
                    existing.setDepartmentId(updated.getDepartmentId());
                    existing.setStartTime(updated.getStartTime());
                    existing.setEndTime(updated.getEndTime());
                    return shiftTemplateRepository.save(existing);
                }).orElse(null);
    }

    @Override
    public void deleteShiftTemplate(Long id) {
        shiftTemplateRepository.deleteById(id);
    }
}
