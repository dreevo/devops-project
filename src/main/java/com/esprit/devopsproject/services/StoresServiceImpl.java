package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.repositories.StoresRepository;
import com.esprit.devopsproject.dto.StoresListResponse;
import com.esprit.devopsproject.services.StoresService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StoresServiceImpl implements StoresService{


    @Autowired
    private StoresRepository storesRepository;


    @Override
    public List<StoresListResponse> getAllStores() {
        log.info("Getting All Stores From Database");
        return storesRepository.findAll()
                .stream().map(s -> StoresListResponse
                        .builder().store_name(s.getStore_name())
                        .store_id(s.getStore_id()).build()).collect(Collectors.toList());
    }

    @Override
    public StoresListResponse getStoreByName(String store_name) {
        log.info("Getting Store by Store_Name From Database");
        return storesRepository.findByName(store_name);

    }


}