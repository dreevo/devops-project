package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.repositories.HRRepository;
import com.esprit.devopsproject.dto.EmployeeListResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class HRServicesImpl implements HRService {
    @Autowired
    private HRRepository repo;

    @Override
    public List<EmployeeListResponse> getAllExpelledEmployees() {

        List expelledEmployees = new ArrayList();
        expelledEmployees =  repo.findByExpelled(true);

        return expelledEmployees;
    }

    @Override
    public List getAllSenior() {
        List seniorEmployees = new ArrayList<>();
        seniorEmployees = repo.findBySeniority(true);
        return seniorEmployees;
    }
}
