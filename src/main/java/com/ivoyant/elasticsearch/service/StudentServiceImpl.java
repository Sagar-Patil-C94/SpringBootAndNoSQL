package com.ivoyant.elasticsearch.service;

import com.ivoyant.elasticsearch.entity.Student;
import com.ivoyant.elasticsearch.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentServiceImpl {
    @Autowired
    private StudentRepo repository;

    // Create a new instance
    public Student save(Student entity) {
        return repository.save(entity);
    }

    // Read all
    public Iterable<Student> findAll() {
        return repository.findAll();
    }

    public Student getStudent(String id) {
        return repository.findById(id).orElse(null);
    }

    // Update
    public Student update(Student entity, String id) {
        Optional<Student> byId = repository.findById(id);
        Student student = byId.get();
        student.setFullName(entity.getFullName());
        student.setAddress(entity.getAddress());
        return repository.save(student);
    }

    // Delete
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
