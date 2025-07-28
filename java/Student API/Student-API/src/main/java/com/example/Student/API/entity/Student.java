package com.example.Student.API.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//this is called database designing
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id automatically generated
    private Long id;

    private String name;

    private String rollNumber;

    // constructor req for object
    public Student() {}

    public Student(String name ,String rollNumber){
        this.name = name;
        this.rollNumber= rollNumber;
    }
    //getter and setter to acess and modify fields
    public Long getId() {return id;}
    private void setId(Long id){this.id=id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getRollNumber() {return rollNumber;}
    public void setRollNumber(String rollNumber) {this.rollNumber = rollNumber;}


}