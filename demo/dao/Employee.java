package com.example.demo.dao;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="Employee")
public class Employee extends BaseModel {
/*
id
createdAt
createdBy
updatedAt
updatedBy
status*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmpId;
    @Column(name = "Emp_name")
    private String Emp_name;
    @Column(name="Emp_Salary")
    private int Salary;

    public Employee() {
    }

    public Employee(int empId, String emp_name, int salary) {
        EmpId = empId;
        Emp_name = emp_name;
        Salary = salary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", Emp_name='" + Emp_name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
