package com.esprit.devopsproject.controller;

import com.esprit.devopsproject.dto.SalaryListResponse;
import com.esprit.devopsproject.services.SalaryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/salary")
@RequiredArgsConstructor
@Slf4j
public class SalaryController {
    private final SalaryService salaryService;

    @GetMapping
    public ResponseEntity<List<SalaryListResponse>> getSalaries(){
        log.info("Getting All Salaries Endpoint");
        return ResponseEntity.ok(salaryService.getAllSalaries());
    }
}
