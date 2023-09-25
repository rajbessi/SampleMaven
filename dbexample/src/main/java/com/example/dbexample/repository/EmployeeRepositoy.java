package com.example.dbexample.repository;

import com.example.dbexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoy extends JpaRepository<Employee,Integer> {

}
