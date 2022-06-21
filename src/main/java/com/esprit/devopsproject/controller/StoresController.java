package com.esprit.devopsproject.controller;

import com.esprit.devopsproject.dto.EmployeeListResponse;
import com.esprit.devopsproject.dto.StoresListResponse;
import com.esprit.devopsproject.services.EmployeeService;
import com.esprit.devopsproject.services.StoresService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
@RequiredArgsConstructor
@Slf4j
public class StoresController {

    private final StoresService storesService;

    @GetMapping
    public ResponseEntity<List<StoresListResponse>> getStores(){
        log.info("Getting All Stores");
        return ResponseEntity.ok(storesService.getAllStores());
    }

}
