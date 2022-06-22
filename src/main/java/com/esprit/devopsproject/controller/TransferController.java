package com.esprit.devopsproject.controller;

import com.esprit.devopsproject.dto.TransferResponse;
import com.esprit.devopsproject.services.TransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transfer")
@RequiredArgsConstructor
@Slf4j
public class TransferController {

    @Autowired
    private TransferService transferService;

    @GetMapping
    public ResponseEntity<List<TransferResponse>> getAllTransfers() {
        log.info("get all transfers endpoint");
        return ResponseEntity.ok(transferService.getAllTransfers());
    }
}
