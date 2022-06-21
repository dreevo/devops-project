package com.esprit.devopsproject.dao.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_stores")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long store_id;
    private String store_location;
    private String store_name;
    private Integer number_of_stuff;

}
