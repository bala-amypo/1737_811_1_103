package com.example.demo.repository;

import com.example.demo.model.ShiftTemplate;
import java.util.*;

public interface ShiftTemplateRepository {
    Optional<ShiftTemplate> findByTemplateNameAndDepartment_Id(String name, Long deptId);
    List<ShiftTemplate> findByDepartment_Id(Long deptId);
    List<ShiftTemplate> findAll();
    ShiftTemplate save(ShiftTemplate s);
}
