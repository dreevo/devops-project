package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.models.Transfer;
import com.esprit.devopsproject.dao.repositories.TransferRepository;
import com.esprit.devopsproject.dto.TransferResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TransferServiceImpl implements TransferService {

    @Autowired
    private TransferRepository transferRepository;

    @Override
    public List<TransferResponse> getAllTransfers() {
        log.info("Getting All Transfers");
        return this.transferRepository.findAll()
                .stream()
                    .map(t -> TransferResponse
                            .builder()
                            .id(t.getId())
                            .name(t.getName())
                            .location(t.getLocation())
                            .startDate(t.getStartDate())
                            .endDate(t.getEndDate())
                            .employees(t.getEmployees())
                            .build()).collect(Collectors.toList());
    }
}
