package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.models.Employee;
import com.esprit.devopsproject.dto.EmployeeListResponse;

import java.util.List;

public interface EmployeeService {
    List<EmployeeListResponse> getAllEmployees();

    Employee getEmployeeByName(String name);
}
