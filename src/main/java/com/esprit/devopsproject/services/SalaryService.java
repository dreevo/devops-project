package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dto.SalaryListResponse;

import java.util.List;

public interface SalaryService {
    List<SalaryListResponse> getAllSalaries();

}

