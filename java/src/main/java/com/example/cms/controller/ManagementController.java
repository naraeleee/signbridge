package com.example.cms.controller;

import com.example.cms.controller.exceptions.ManagementNotFoundException;
import com.example.cms.model.entity.Management;
import com.example.cms.model.entity.User;
import com.example.cms.model.repository.ManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ManagementController {
    @Autowired
    private final ManagementRepository repository;

    public ManagementController(ManagementRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    List<Management> retrieveAllEmployees() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    Management createEmployee(@RequestBody Management newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Management retrieveEmployee(@PathVariable("id") Long employeeId) {
        return repository.findById(employeeId)
                .orElseThrow(() -> new ManagementNotFoundException(employeeId));
    }

    @PutMapping("/employees/{id}")
    Management updateEmployee(@RequestBody Management newEmployee, @PathVariable("id") Long employeeId) {
        return repository.findById(employeeId)
                .map(employee -> {
                    employee.setFirstName(newEmployee.getFirstName());
                    employee.setLastName(newEmployee.getLastName());
                    employee.setEmail(newEmployee.getEmail());
                    employee.setPassword(newEmployee.getPassword());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(employeeId);
                    newEmployee.setEmail(newEmployee.getEmail());
                    newEmployee.setPassword(newEmployee.getPassword());
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable("id") Long employeeId) {
        repository.deleteById(employeeId);
    }
}