package com.kularatne.emsapplication.controller;

import com.kularatne.emsapplication.model.Employee;
import com.kularatne.emsapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //Get all employees REST API
    @GetMapping("/employees")
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployees();
    }
}
