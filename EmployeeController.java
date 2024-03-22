package com.example.demo.controller;

import com.example.demo.dao.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
   private EmployeeService employeeService;

@PostMapping("/employee")
    public String createNewEmp(@RequestBody Employee employee){

    return "Employee created in database";
    }


}
