package com.springproject.restApi.controllers;

import com.springproject.restApi.models.Employee;
import com.springproject.restApi.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v0.1/employees")
public class EmployeeController {
    private EmployeeService employeeService;
    @Operation(
            summary = "Вывод пользователей",
            description = "Выводит всех пользователей"
    )
    @GetMapping
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
    @Operation(
            summary = "Добавление пользователя",
            description = "Доабление пользователя"
    )

 @PostMapping("add_employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @Operation(
            summary = "Поиск пользователя",
            description = "Поиск пользователя по id"
    )

  @GetMapping("/{id}")
    public Employee findEmployee(@PathVariable long id) {
        return employeeService.findEmployee(id);
    }
    @Operation(
            summary = "Обновление пользователя",
            description = "Обновление пользователя"
    )

    @PutMapping("update_employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }
    @Operation(
            summary = "Удаление пользователя",
            description = "Удаление пользователя"
    )

   @DeleteMapping("delete_employee/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }
    @Operation(
            summary = "Удаление всех пользователей",
            description = "Удаление всех пользователей"
    )
    @DeleteMapping("clear_employee")
    public void clearAll() {
        employeeService.clearAll();
    }
}
