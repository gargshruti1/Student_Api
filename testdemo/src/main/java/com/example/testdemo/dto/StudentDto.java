package com.example.testdemo.dto;

import lombok.Data;

@Data
public class StudentDto {
    private int studId;
    private String studName;
    private boolean active;
    private int studClass;
    private float percentage;
}
