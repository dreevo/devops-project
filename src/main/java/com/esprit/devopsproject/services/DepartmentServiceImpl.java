package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.models.Department;
import com.esprit.devopsproject.dao.repositories.DepartmentRepository;
import com.esprit.devopsproject.dto.DepartmentListResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{


    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public List<DepartmentListResponse> getAllDepartments() {
        log.info("Getting All Departments From Database");
        return departmentRepository.findAll()
                .stream().map(d -> DepartmentListResponse
                        .builder().name(d.getName())
                        .id(d.getId()).build()).collect(Collectors.toList());
    }

    @Override
    public Department getDepartmentByName(String name) {
        log.info("Getting Department by Name From Database");
        return departmentRepository.findByName(name);
    }

}
