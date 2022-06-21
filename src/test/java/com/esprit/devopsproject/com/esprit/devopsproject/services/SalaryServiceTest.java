package com.esprit.devopsproject.com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.models.Salary;
import com.esprit.devopsproject.dao.repositories.SalaryRepository;
import com.esprit.devopsproject.dto.SalaryListResponse;
import com.esprit.devopsproject.services.SalaryService;
import com.esprit.devopsproject.services.SalaryServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class SalaryServiceTest {

    private static ArrayList<Salary> mockSalaries = new ArrayList<>();

    static {
        mockSalaries.add(Salary.builder().description("salary Bonuses").amount(23).type("Bonuses").id(0L).build());
        mockSalaries.add(Salary.builder().description("salary Commission ").amount(1024).type("Commission").id(1L).build());
    }

    @Autowired
    SalaryService salaryService;

    @Mock
    private SalaryRepository salaryRepository;

    @InjectMocks
    private SalaryService salaryServiceImpl = new SalaryServiceImpl();

    @DisplayName("Test Get All Salaries Without Mock")
    @Test
    void testGetAllSalaries() {
        assertEquals(4, salaryService.getAllSalaries().size());
    }

    @BeforeEach
    void setMockOutput() {
        when(salaryRepository.findAll())
                .thenReturn(mockSalaries);
    }

    @DisplayName("Test Get All Salaries With Mock")
    @Test
    void testGetAllEmployeesWithMock() {
        assertEquals(mockSalaries.stream().map(e -> SalaryListResponse.builder().amount(e.getAmount())
                .description(e.getDescription()).type(e.getType())
                .id(e.getId()).build()).collect(Collectors.toList()), salaryServiceImpl.getAllSalaries());
    }


}


