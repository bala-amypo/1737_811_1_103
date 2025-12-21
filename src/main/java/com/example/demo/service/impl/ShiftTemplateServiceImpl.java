package com.example.scheduler.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scheduler.entity.ShiftTemplate;
import com.example.scheduler.repository.ShiftTemplateRepository;
import com.example.scheduler.service.ShiftTemplateService;

@Service
public class ShiftTemplateServiceImpl implements ShiftTemplateService {

    @Autowired
    private ShiftTemplateRepository repo;

    @Override
    public ShiftTemplate create(ShiftTemplate template) {

        if (repo.existsByDepartmentIdAndStartTimeAndEndTime(
                template.getDepartment().getId(),
                template.getStartTime(),
                template.getEndTime())) 
        {
            throw new RuntimeException("Duplicate shift timing!");
        }

        return repo.save(template);
    }

    @Override
    public List<ShiftTemplate> getByDepartment(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }

    @Override
    public List<ShiftTemplate> getAll() {
        return repo.findAll();
    }
}
