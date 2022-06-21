package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.repositories.HRRepository;
import com.esprit.devopsproject.dto.EmployeeListResponse;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class HRServicesImpl implements HRService {
    @Autowired
    private HRRepository repo;

    @Override
    public List<EmployeeListResponse> getAllExpelledEmployees() {
        return repo.findByExpelled(true);
    }

    @Override
    public List getAllSenior() {
        return repo.findBySeniority(true);
    }
}
