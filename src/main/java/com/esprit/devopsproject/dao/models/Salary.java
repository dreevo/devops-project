package com.esprit.devopsproject.dao.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_salary")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String description;
    private Integer amount;
}
