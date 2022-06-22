package com.esprit.devopsproject.com.esprit.devopsproject.services;

import com.esprit.devopsproject.dao.models.Employee;
import com.esprit.devopsproject.dao.models.Transfer;
import com.esprit.devopsproject.dao.repositories.TransferRepository;
import com.esprit.devopsproject.dto.TransferResponse;
import com.esprit.devopsproject.services.TransferService;
import com.esprit.devopsproject.services.TransferServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class TransferServiceTest {
    private static ArrayList<Transfer> mockTransfers = new ArrayList<>();
    private static Set<Employee> mockEmployees = new HashSet<>();

    static {
        mockEmployees.add(Employee.builder()
                .email("jack@gmail.com")
                .age(23)
                .username("jack")
                .id(0L)
                .build());
        mockEmployees.add(Employee.builder()
                .email("john@gmail.com")
                .age(24)
                .username("john")
                .id(1L)
                .build());

        mockTransfers.add(Transfer.builder()
                .id(0L)
                .name("JavaScript Conference")
                .location("Spain")
                .startDate(LocalDate.of(2022, 1, 1))
                .endDate(LocalDate.of(2022, 2, 1))
                .employees(mockEmployees)
                .build());
        mockTransfers.add(Transfer.builder()
                .id(0L)
                .name("Angular Conference")
                .location("England")
                .startDate(LocalDate.of(2022, 1, 1))
                .endDate(LocalDate.of(2023, 1, 1))
                .employees(mockEmployees)
                .build());
    }

    @Autowired
    TransferService transferService;

    @Mock
    private TransferRepository transferRepository;

    @InjectMocks
    private TransferService transferServiceImpl = new TransferServiceImpl();

    @DisplayName("Test Get All Transfers Without Mock")
    @Test
    void testGetAllTransfers() {
        assertEquals(2, transferService.getAllTransfers()
                .size());
    }

    @BeforeEach
    void setMockOutput() {
        when(transferRepository.findAll())
                .thenReturn(mockTransfers);
    }

    @DisplayName("Test Get All Transfers With Mock")
    @Test
    void testGetAllTransfersWithMock() {
        assertEquals(mockTransfers.stream()
                .map(e -> TransferResponse.builder()
                        .id(e.getId())
                        .name(e.getName())
                        .location(e.getLocation())
                        .endDate(e.getEndDate())
                        .startDate(e.getStartDate())
                        .employees(e.getEmployees())
                        .build())
                .collect(Collectors.toList()), transferServiceImpl.getAllTransfers());
    }

}
