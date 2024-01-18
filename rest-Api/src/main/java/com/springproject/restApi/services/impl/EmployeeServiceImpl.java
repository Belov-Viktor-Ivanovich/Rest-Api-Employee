package com.springproject.restApi.services.impl;

import com.springproject.restApi.models.Employee;
import com.springproject.restApi.repositories.EmployeeDAO;
import com.springproject.restApi.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    @Override
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAllEmployees();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDAO.addEmployee(employee);
    }

    @Override
    public Employee findEmployee(long id) {
        return employeeDAO.findEmployee(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(long id) {
    employeeDAO.deleteEmployee(id);
    }

    @Override
    public void clearAll() {
        employeeDAO.clearAll();
    }
}
