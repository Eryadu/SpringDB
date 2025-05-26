package io.pragra.feb25jpa.h2db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public void displayStudent() {
        List<Student> studentList = studentDao.getAllStudents();
        System.out.println(studentList);
    }

    public void addStudent(Student student) {
        studentDao.createStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(Integer id) {
        studentDao.deleteStudent(id);
    }

    public Student getStudentById(Integer id) {
        return studentDao.getStudentById(id);
    }
}
