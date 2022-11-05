package com.kularatne.emsapplication.service;

import com.kularatne.emsapplication.exception.ResourceNotFoundException;
import com.kularatne.emsapplication.model.Employee;
import com.kularatne.emsapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Get all employee details
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //Save an Employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    //Get an employee by Id
    public Employee getEmployeeById(Long id) {
        Employee foundEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with the id: " + id));
        return foundEmployee;
    }
}
