package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.models.Department;
import com.esprit.devopsproject.dto.DepartmentListResponse;

import java.util.List;

public interface DepartmentService {
    List<DepartmentListResponse> getAllDepartments();

    Department getDepartmentByName(String name);
}
