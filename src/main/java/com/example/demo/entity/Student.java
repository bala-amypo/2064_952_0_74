package com.example.demo.entity;
 
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.id;
@Entity
public class student {
    @Id
    @GeneratedValue(strategyeGenerationType.IDENTITY);
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;
    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
      public String getName(){
        return name;
    }
      public void setName(String name){
        this.name=name;
    }
      public String getDEPT(){
        return dept;
    }
      public void setDEPT(String dept){
        this.dept=dept;
    }
      public LocalDate getDOB(){
        return dob;
    }
      public void setDOB(LocalDate dob){
        this.dob=dob;
    }
      public float getCGPA(){
        return cgpa;
    }
      public void setCGPAT(float cgpa){
        this.cgpa=cgpa;
    }
    public Student(int id, String name, String dept,LocalDate dob,float cgpa) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.cgpa = cgpa;
    }
    public Student() {
    }
    
}