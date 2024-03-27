package com.ivoyant.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cassandra")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @GetMapping("/findAll")
    public List<Employee> findAll() {
        return new ArrayList<>(employeeService.findAll());
    }

    @GetMapping("/findById/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        return employeeService.update(employee, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteById(id);
    }
}
