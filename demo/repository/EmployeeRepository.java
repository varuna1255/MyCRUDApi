package com.example.demo.repository;

import com.example.demo.dao.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
