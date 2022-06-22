package com.esprit.devopsproject.controller;

import com.esprit.devopsproject.dto.EmployeeListResponse;
import com.esprit.devopsproject.services.HRService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hr")
@RequiredArgsConstructor
@Slf4j
public class HumanRessourcesController {


    private HRService hrService;

    @GetMapping
    public ResponseEntity<List<EmployeeListResponse>> getExpelled() {
        log.info("Getting All Expelled Employees");
        return ResponseEntity.ok(hrService.getAllExpelledEmployees());
    }

}
