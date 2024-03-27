package com.ivoyant.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<Employee>();
        employeeRepo.findAll().forEach(employees::add);
        return employees;
    }

    public Employee create(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findById(int id) {
        return employeeRepo.findById(id).get();
    }

    public Employee update(Employee employee, int id) {
        Employee byId = employeeRepo.findById(id).isPresent() ? employee : null;
        byId.setId(employee.getId());
        byId.setName(employee.getName());
        return employeeRepo.save(byId);
    }

    public void deleteById(int id) {
        employeeRepo.deleteById(id);
    }
}
