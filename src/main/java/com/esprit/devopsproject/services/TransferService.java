package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dto.TransferResponse;

import java.util.List;

public interface TransferService {
    List<TransferResponse> getAllTransfers();
}
