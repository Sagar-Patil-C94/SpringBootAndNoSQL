package com.ivoyant.elasticsearch.controller;

import com.ivoyant.elasticsearch.entity.Student;
import com.ivoyant.elasticsearch.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elasticsearch")
public class EsController {
    @Autowired
    private StudentServiceImpl service;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudent(@PathVariable String id) {
        return service.getStudent(id);
    }

    @GetMapping("/getAllStudents")
    public Iterable<Student> getList() {
        return service.findAll();
    }

    @PostMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
        return service.update(student, id);
    }

    @GetMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.deleteById(id);
    }
}
