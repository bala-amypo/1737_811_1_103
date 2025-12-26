package com.example.demo.service.impl;

import com.example.demo.model.ShiftTemplate;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.ShiftTemplateRepository;
import com.example.demo.service.ShiftTemplateService;

import java.util.List;

public class ShiftTemplateServiceImpl implements ShiftTemplateService {

    private final ShiftTemplateRepository repo;
    private final DepartmentRepository deptRepo;

    public ShiftTemplateServiceImpl(ShiftTemplateRepository r,
                                    DepartmentRepository d) {
        this.repo = r;
        this.deptRepo = d;
    }

    @Override
    public ShiftTemplate create(ShiftTemplate s) {

        Long deptId = s.getDepartment().getId();
        deptRepo.findById(deptId)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        if (s.getEndTime().isBefore(s.getStartTime()))
            throw new RuntimeException("after");

        if (repo.findByTemplateNameAndDepartment_Id(
                s.getTemplateName(), deptId).isPresent())
            throw new RuntimeException("unique");

        return repo.save(s);
    }

    @Override
    public List<ShiftTemplate> getByDepartment(Long deptId) {
        return repo.findByDepartment_Id(deptId);
    }

    @Override
    public List<ShiftTemplate> getAll() {
        return repo.findAll();
    }
}
