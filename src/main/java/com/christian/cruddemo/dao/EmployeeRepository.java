package com.christian.cruddemo.dao;

import com.christian.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
    //finished.... all crud methods come from SpringDataJPA
}
