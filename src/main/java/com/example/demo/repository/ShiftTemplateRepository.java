package com.example.demo.repository;

import com.example.demo.model.ShiftTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShiftTemplateRepository extends JpaRepository<ShiftTemplate,Long>{
    Optional<ShiftTemplate> findByTemplateNameAndDepartment_Id(String name, Long id);
}
