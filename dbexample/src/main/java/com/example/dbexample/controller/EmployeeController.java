package com.example.dbexample.controller;

import com.example.dbexample.model.Employee;
import com.example.dbexample.repository.EmployeeRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepositoy employeeRepositoy;

    @GetMapping("/all")
    List<Employee> getall(){
        return employeeRepositoy.findAll();
    }
    @GetMapping("/employeedetails/{id}")
    Employee getEmpdetails(@PathVariable("id") int id){
     return employeeRepositoy.findById(id).get();
    }

    @PostMapping("/employeestore")
    String saveData(@RequestBody Employee employee){
        employeeRepositoy.save(employee);
        return "Data saved successfully";
    }
}
