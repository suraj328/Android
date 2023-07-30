package com.example.labreport;

import java.io.Serializable;

public class Student implements Serializable {
   private String name,faculty;
   public Student(String name,String faculty){
       this.name = name;
       this.faculty = faculty;
   }
    public String getName(){return this.name;};
    public String getFaculty(){return this.faculty;};
}
