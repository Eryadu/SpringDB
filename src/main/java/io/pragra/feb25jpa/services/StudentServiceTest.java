package io.pragra.feb25jpa.services;

import io.pragra.feb25jpa.entities.StudentJPA;
import io.pragra.feb25jpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceTest {
    @Autowired
    StudentRepo studentRepo;

    public List<StudentJPA> getAllStudents() {
        return studentRepo.findAll();
    }

    public void createStudent() {
        studentRepo.save(new StudentJPA(101,"Bob","Bob@bob.com"));
    }

    public void updateStudent() {
        StudentJPA student = studentRepo.findById(5).get();
        student.setName("Charle");
        studentRepo.save(student);
    }
}
