package com.example.Student.API.repository;

import com.example.Student.API.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//This interface gives access to basic CRUD   methods for Student

public interface StudentRepository extends JpaRepository<Student, Long> {

}
