package com.example.skBackend.controller;

import com.example.skBackend.entity.Employee;
import com.example.skBackend.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public Employee newEmployee(@RequestBody Employee newEmployee){
        return employeeRepository.save(newEmployee);
    }

    @GetMapping("/employees")
    public List<Employee> listEmployees(){
        return employeeRepository.findAll();
    }

    @DeleteMapping("/employees")
    public ResponseEntity deleteEmployee(@RequestBody Long idEmployee){
        employeeRepository.deleteById(idEmployee);
        return ResponseEntity.ok().build();
    }


}
