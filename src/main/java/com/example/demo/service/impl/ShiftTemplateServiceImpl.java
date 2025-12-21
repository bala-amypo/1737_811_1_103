package com.example.demo.service.impl;

import com.example.demo.model.ShiftTemplate;
import com.example.demo.repository.ShiftTemplateRepository;
import com.example.demo.service.ShiftTemplateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftTemplateServiceImpl implements ShiftTemplateService {

    private final ShiftTemplateRepository repo;

    public ShiftTemplateServiceImpl(ShiftTemplateRepository repo){
        this.repo = repo;
    }

    public ShiftTemplate create(ShiftTemplate t){

        if(!t.getEndTime().isAfter(t.getStartTime()))
            throw new IllegalArgumentException("after");

        repo.findByTemplateNameAndDepartment_Id(
                t.getTemplateName(),
                t.getDepartment().getId()
        ).ifPresent(x -> {
            throw new RuntimeException("unique");
        });

        return repo.save(t);
    }

    public List<ShiftTemplate> getByDepartment(Long depId){
        return repo.findByDepartment_Id(depId);
    }
}
