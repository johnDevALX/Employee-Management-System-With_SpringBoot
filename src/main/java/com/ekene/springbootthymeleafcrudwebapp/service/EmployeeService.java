package com.ekene.springbootthymeleafcrudwebapp.service;

import com.ekene.springbootthymeleafcrudwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
