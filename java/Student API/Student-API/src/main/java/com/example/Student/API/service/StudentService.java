package com.example.Student.API.service;

import com.example.Student.API.entity.Student;
import com.example.Student.API.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private final StudentRepository repository;


   // Using constructor injection(instead of @Autowired)
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Save student to database
    public Student savestudent(Student student){
        return repository.save(student);
    }



}
