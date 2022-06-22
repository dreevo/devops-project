package com.esprit.devopsproject.dao.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "t_transfer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate startDate;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate endDate;

    @ManyToMany(mappedBy="transfers")
    @JsonIgnore
    private Set<Employee> employees;

}
