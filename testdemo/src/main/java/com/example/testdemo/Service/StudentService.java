package com.example.testdemo.Service;

import com.example.testdemo.Entity.StudentEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface StudentService {
StudentEntity saveStudentEntity(StudentEntity studentEntity);
    List<StudentEntity> fetchstudent_id();

    List<StudentEntity> fetchStudent_id();

    StudentEntity updateStudentEntity(StudentEntity studentEntity,
                                      Long student_Id);

    void deleteStudentEntity(Long student_Id);

    List<StudentEntity> fetchStudentEntities();
}
