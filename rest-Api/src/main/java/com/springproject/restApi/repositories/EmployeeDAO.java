package com.springproject.restApi.repositories;

import com.springproject.restApi.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class EmployeeDAO {
    List<Employee>employees = new ArrayList<>();
    long id=0;
    /*{
        employees.add(Employee.builder().id(++id).name("Pol").surname("POnald").build());
        employees.add(Employee.builder().id(++id).name("Pol2").surname("POnaldson").build());
        employees.add(Employee.builder().id(++id).name("Pol3").surname("POn").build());
    }*/

    public List<Employee> findAllEmployees() {
        return employees;
    }
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }
    public Employee findEmployee(long id) {//найти по id
        return employees.stream().filter(el->el.getId()==id).findFirst().orElse(null);
    }

    public Employee updateEmployee(Employee employee) {
        //Employee buf= employees.stream().filter(el->el.getId()==employee.getId()).findFirst().get();

        int index = IntStream.range(0,employees.size())
                .filter(ind->employees.get(ind).getId()==employee.getId())
                .findFirst().orElse(-1);
        if(index!=-1){
            employees.set(index,employee);
            return employee;
        }
        else return null;
    }

    public void deleteEmployee(long id) {
        try {
            employees.remove(findEmployee(id));
        }
        catch (Exception ex){}
    }

    public void clearAll() {
        employees.removeAll(employees);
    }

}
