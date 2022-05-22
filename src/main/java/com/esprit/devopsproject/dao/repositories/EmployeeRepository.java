package com.esprit.devopsproject.dao.repositories;

import com.esprit.devopsproject.dao.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
