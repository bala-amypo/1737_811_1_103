package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.ScheduleService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleServiceImpl implements ScheduleService {

    private final DepartmentRepository departmentRepository;
    private final ShiftTemplateRepository shiftTemplateRepository;
    private final AvailabilityRepository availabilityRepository;
    private final GeneratedShiftScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(DepartmentRepository departmentRepository,
                               ShiftTemplateRepository shiftTemplateRepository,
                               AvailabilityRepository availabilityRepository,
                               GeneratedShiftScheduleRepository scheduleRepository) {
        this.departmentRepository = departmentRepository;
        this.shiftTemplateRepository = shiftTemplateRepository;
        this.availabilityRepository = availabilityRepository;
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<GeneratedShiftSchedule> generateForDate(LocalDate date) {

        List<GeneratedShiftSchedule> result = new ArrayList<>();

        List<EmployeeAvailability> availableEmployees =
                availabilityRepository.findByAvailableDateAndAvailable(date, true);

        if (availableEmployees.isEmpty()) {
            return result;
        }

        for (Department dept : departmentRepository.findAll()) {

            List<ShiftTemplate> templates =
                    shiftTemplateRepository.findByDepartment_Id(dept.getId());

            for (ShiftTemplate template : templates) {

                for (EmployeeAvailability availability : availableEmployees) {

                    Employee emp = availability.getEmployee();

                    if (emp.getSkillSet().containsAll(
                            template.getRequiredSkills() == null
                                    ? List.of()
                                    : List.of(template.getRequiredSkills().split(",")))) {

                        GeneratedShiftSchedule schedule =
                                new GeneratedShiftSchedule(
                                        date,
                                        template.getStartTime(),
                                        template.getEndTime(),
                                        template,
                                        dept,
                                        emp);

                        scheduleRepository.save(schedule);
                        result.add(schedule);
                        break;
                    }
                }
            }
        }

        return result;
    }

    @Override
    public List<GeneratedShiftSchedule> getByDate(LocalDate date) {
        return scheduleRepository.findByShiftDate(date);
    }
}
