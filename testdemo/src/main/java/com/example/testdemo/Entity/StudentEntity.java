package com.example.testdemo.Entity;

import com.example.testdemo.dto.StudentDto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Data
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stud_id")
    private int studId;
    @Column(name = "stud_name")
    private String studName;
    @Column(name = "Active")
    private boolean active;
    @Column(name = "stud_class")
    private int studClass;
    @Column(name = "percentage")
    private float percentage;

    public StudentEntity() {
    }

}



