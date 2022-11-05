package com.kularatne.emsapplication.service;

import com.kularatne.emsapplication.model.Employee;
import com.kularatne.emsapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Get all employee details
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
