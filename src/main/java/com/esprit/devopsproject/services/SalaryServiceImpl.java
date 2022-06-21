package com.esprit.devopsproject.services;


import com.esprit.devopsproject.dao.repositories.SalaryRepository;
import com.esprit.devopsproject.dto.SalaryListResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Override
    public List<SalaryListResponse> getAllSalaries() {
        log.info("Getting All Salaries From Database");
        return salaryRepository.findAll()
                .stream().map(e -> SalaryListResponse
                        .builder().amount(e.getAmount())
                        .type(e.getType()).description(e.getDescription())
                        .id(e.getId()).build()).collect(Collectors.toList());
    }
}
