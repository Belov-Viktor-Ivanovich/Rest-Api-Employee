package com.springproject.restApi.services;

import com.springproject.restApi.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee addEmployee(Employee employee);
    Employee findEmployee(long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(long id);
    void clearAll();
}
