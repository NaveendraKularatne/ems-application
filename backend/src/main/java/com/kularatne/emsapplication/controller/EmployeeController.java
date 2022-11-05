package com.kularatne.emsapplication.controller;

import com.kularatne.emsapplication.model.Employee;
import com.kularatne.emsapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.StubNotFoundException;
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

    //Save/Create Employee REST API
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    //Get an Employee by ID
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee foundEmployee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(foundEmployee);
    }
}
