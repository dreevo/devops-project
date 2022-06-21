package com.esprit.devopsproject.com.esprit.devopsproject.services;

import com.esprit.devopsproject.dto.StoresListResponse;
import com.esprit.devopsproject.services.StoresServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StoresServiceTest {

    @Autowired
    StoresServiceImpl storesService ;

    @Test
    public void testRetrieveAllStores() {
        List<StoresListResponse> listStores = storesService.getAllStores();
        Assertions.assertEquals(5, listStores.size());
    }

}