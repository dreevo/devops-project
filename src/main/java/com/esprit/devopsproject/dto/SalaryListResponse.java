package com.esprit.devopsproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalaryListResponse {
    private Long id;
    private String type;
    private String description;
    private Integer amount;
}
