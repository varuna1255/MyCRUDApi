package com.example.demo.service.impl;

import com.example.demo.dao.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    // save employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // get employee by id
    public Employee getEmployeeById(int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isEmpty()) {
            return null;
        } else return optional.get();
    }

    // get all employee
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    // update employee
    public Employee updateEmployee(Employee employee, int id) {
        Employee existingEmployee = getEmployeeById(id);
        if(existingEmployee != null) {
            existingEmployee.setEmp_name(employee.getEmp_name());
            existingEmployee.setSalary(employee.getSalary());
            return employeeRepository.save(existingEmployee);
        } else return null;
    }

    // delete employee
    public boolean deleteEmployee (int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()) {
            employeeRepository.delete(optional.get());
            return true;
        } else return false;
    }

}
