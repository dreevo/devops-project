package com.esprit.devopsproject.dto;

import com.esprit.devopsproject.dao.models.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransferResponse {
    private Long id;
    private String name;
    private String location;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate startDate;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate endDate;

    @JsonIgnore
    private Set<Employee> employees;
}
