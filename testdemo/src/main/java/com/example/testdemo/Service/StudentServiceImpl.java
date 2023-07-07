package com.example.testdemo.Service;

import com.example.testdemo.Entity.StudentEntity;
import com.example.testdemo.Repository.StudentRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepo studentRepo;
            public StudentEntity saveStudentEntity(StudentEntity studentEntity)
            {
                return studentRepo.save(studentEntity);

            }

    @Override
    public List<StudentEntity> fetchstudent_id() {
        return null;
    }

    @Override
    public List<StudentEntity> fetchStudent_id() {
        return null;
    }

    @Override
    public StudentEntity updateStudentEntity(StudentEntity studentEntity, Long Student_id) {
        return null;
    }

    @Override
    public void deleteStudentEntity(Long Student_id) {

    }

    @Override
    public List<StudentEntity> fetchStudentEntities() {
        return null;
    }
}


