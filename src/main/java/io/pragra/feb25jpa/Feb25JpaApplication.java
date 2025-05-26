package io.pragra.feb25jpa;

import io.pragra.feb25jpa.h2db.Student;
import io.pragra.feb25jpa.h2db.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Feb25JpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Feb25JpaApplication.class, args);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.displayStudent();
        studentService.addStudent(new Student(7,"ABC","23"));
        studentService.updateStudent(new Student(7,"YAD","32"));
        studentService.deleteStudent(7);
        Student student = studentService.getStudentById(5);
        System.out.println(student);
    }
}
