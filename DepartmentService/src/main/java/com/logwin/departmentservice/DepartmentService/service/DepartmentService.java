package com.logwin.departmentservice.DepartmentService.service;

import com.logwin.departmentservice.DepartmentService.entity.Department;
import com.logwin.departmentservice.DepartmentService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElse(null);
    }
}
