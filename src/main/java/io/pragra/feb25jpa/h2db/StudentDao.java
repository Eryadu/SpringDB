package io.pragra.feb25jpa.h2db;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentDao {

    //Read : List all students
    List<Student> getAllStudents();

    //Create: Insert a new student record
    void createStudent(Student student);

    //Update: Update student record
    void updateStudent(Student student);

    //Delete: Delete student record
    void deleteStudent(Integer id);

    // Read: Retrieve a student by ID
    Student getStudentById(Integer id);
}
