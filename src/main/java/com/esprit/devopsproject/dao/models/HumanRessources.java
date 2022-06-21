package com.esprit.devopsproject.dao.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

    @Entity
    @Table(name = "t_hr")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class HumanRessources {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String email;
        private String username;
        private Integer age;

    }
