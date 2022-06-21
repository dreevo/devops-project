package com.esprit.devopsproject.dao.repositories;

import com.esprit.devopsproject.dao.models.Stores;
import com.esprit.devopsproject.dto.StoresListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StoresRepository extends JpaRepository<Stores, Long> {

    @Query("SELECT s FROM Stores s WHERE s.store_name= :store_name ")
        public StoresListResponse findByName(@Param("store_name") String store_name);
}
