package com.example.testdemo.Service;

import com.example.testdemo.Entity.StudentEntity;
import com.example.testdemo.Repository.StudentRepo;
import com.example.testdemo.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service("StudentService1")
public class StudentService1 {

@Autowired
private StudentRepo studentRepo;


    public StudentEntity saveStudentDto(StudentDto studentDto) {

        StudentEntity student = new StudentEntity();
        student.setStudName(studentDto.getStudName());
        student.setStudId(studentDto.getStudId());
        student.setPercentage(studentDto.getPercentage());
        student.setActive(studentDto.isActive());
        student.setStudClass(studentDto.getStudClass());

        try {
            studentRepo.save(student);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return student;
    }

    public List<StudentEntity> StudentFindAll() {
        return (List<StudentEntity>) studentRepo.findAll();

    }
    public StudentEntity fetchStudentEntitiesById(StudentDto sid) {

        Optional<StudentEntity> byId = null;
        try {
            byId = studentRepo.findById(sid.getStudId());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (Objects.nonNull(byId) && byId.isPresent()){
            return byId.get();
        }

        return null;

    }


    public StudentEntity updateStudentEntity(StudentDto studentEntity) {
        try {
            StudentEntity depDB = studentRepo.findById(studentEntity.getStudId()).get();

            depDB.setPercentage(studentEntity.getPercentage());
            depDB.setStudName(studentEntity.getStudName());

            return studentRepo.save(depDB);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to update student entity");
        }
    }

    public StudentEntity updateStudentEntityById(StudentDto studentEntity) {
        try {
            StudentEntity depDB = studentRepo.findById(studentEntity.getStudId())
                    .get();

            depDB.setActive(studentEntity.isActive());

            return studentRepo.save(depDB);
        }
        catch  (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to update student entity");
        }

    }
}


