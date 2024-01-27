package com.manoj.projectjdk17.controller;

import com.manoj.projectjdk17.entity.Employee;
import com.manoj.projectjdk17.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<List<Employee>> getEmployeesReportingToManager(@PathVariable Long id){
        List<Employee> employeeList = employeeService.findEmployeesReportingToManager(id);
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }
}
