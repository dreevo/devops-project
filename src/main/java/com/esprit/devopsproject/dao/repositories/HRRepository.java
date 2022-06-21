
package com.esprit.devopsproject.dao.repositories;

import com.esprit.devopsproject.dao.models.Employee;
import com.esprit.devopsproject.dao.models.HumanRessources;
import com.esprit.devopsproject.dto.EmployeeListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HRRepository extends JpaRepository<Employee,Long> {
    List<EmployeeListResponse> findByExpelled(Boolean expelled);
    List<EmployeeListResponse> findBySeniority (Boolean seniority);

}
