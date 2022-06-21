package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dto.EmployeeListResponse;

import java.util.List;

public interface HRService {
    List<EmployeeListResponse> getAllExpelledEmployees();
    List<EmployeeListResponse> getAllSenior();
}
