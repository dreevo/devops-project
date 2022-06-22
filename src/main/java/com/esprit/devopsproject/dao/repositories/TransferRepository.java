package com.esprit.devopsproject.dao.repositories;

import com.esprit.devopsproject.dao.models.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
