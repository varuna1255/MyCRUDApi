package com.example.demo.service;

import com.example.demo.dao.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {


         //Saves a new employee entity.
        Employee saveEmployee(Employee employee) throws Exception;

        // Retrieves an employee entity by its unique identifier.

        Employee getEmployeeById(int id) throws Exception;

        // Retrieves a list of all employee entities.
        List<Employee> getAllEmployees() throws Exception;

        boolean deleteEmployee(int id) throws Exception;

        // Optional methods (consider adding these based on your application's needs)

        Employee updateEmployee(Employee employee,int id) throws Exception;


}
