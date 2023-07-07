package com.example.testdemo.Controller;

import com.example.testdemo.Entity.StudentEntity;
import com.example.testdemo.Service.StudentService1;
import com.example.testdemo.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@EnableJpaRepositories
@EnableWebMvc
@EnableSpringDataWebSupport
@SpringBootApplication
@EnableSwagger2
@RestController
public class StudentController {

    @Autowired
    private StudentService1 studentService;

//    @Autowired
//    private StudentServiceImpl studentService;

    @PostMapping("/student")
    public StudentEntity saveStudentEntity(@RequestBody StudentDto studentDto) {
        return studentService.saveStudentDto(studentDto);
    }

    @GetMapping("/studentFindAll")
    public List<StudentEntity> fetchStudentEntities() {
        return studentService.StudentFindAll();
    }


    @GetMapping("/studentFindById")
    public StudentEntity fetchStudentEntitiesById(@RequestBody StudentDto studentId) {
        return studentService.fetchStudentEntitiesById(studentId);
    }


    @PutMapping("/studentUpdate")
    public StudentEntity updateStudentEntity(@RequestBody StudentDto studentId) {
        return studentService.updateStudentEntity(studentId);
    }


    @PutMapping("/studentInActive")
    public StudentEntity updateStudentEntityById(@RequestBody StudentDto studentId) {
        return studentService.updateStudentEntityById(studentId);
    }

}




