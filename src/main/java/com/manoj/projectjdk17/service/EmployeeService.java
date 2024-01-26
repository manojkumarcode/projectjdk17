package com.manoj.projectjdk17.service;

import com.manoj.projectjdk17.entity.Employee;
import com.manoj.projectjdk17.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findEmployeesReportingToManager(Long managerId){
        return employeeRepository.findByManagerId(managerId);
    }
}
