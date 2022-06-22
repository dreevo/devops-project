package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.repositories.HRRepository;
import com.esprit.devopsproject.dto.EmployeeListResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@Slf4j
public class HRServicesImpl implements HRService {
    @Autowired
    private HRRepository repo;

    @Override
    public List<EmployeeListResponse> getAllExpelledEmployees() {
        return repo.findByExpelled(true);
    }

    @Override
    public List<EmployeeListResponse> getAllSenior() {
        return repo.findBySeniority(true);
    }
}
