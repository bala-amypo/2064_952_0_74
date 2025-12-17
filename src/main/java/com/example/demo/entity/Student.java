package com.example.demo.entity;
 
import java.time.LocalDate;

public class student {
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
      public void getName(){
        return name;
    }
      public void setName(String name){
        this.name=name;
    }
      public void getDEPT(){
        return dept;
    }
      public void setDEPT(long id){
        this.id=id;
    }
}