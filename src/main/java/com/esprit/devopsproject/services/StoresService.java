package com.esprit.devopsproject.services;

import com.esprit.devopsproject.dto.EmployeeListResponse;
import com.esprit.devopsproject.dto.StoresListResponse;

import java.util.List;

public interface StoresService {
    List<StoresListResponse> getAllStores();
    StoresListResponse getStoreByName(String store_name);

}
