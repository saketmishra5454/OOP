package com.example.Student.API.controller;


import com.example.Student.API.entity.Student;
import com.example.Student.API.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Autowired
    private StudentService service;

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return service.save(student);
    }
}
