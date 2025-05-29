package io.pragra.feb25jpa.dataLoader;

import io.pragra.feb25jpa.entities.Student;
import io.pragra.feb25jpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// StudentDataLoader class is a special class usually used to implement CommandLineRunner to preinitialized some data
// for database so, if any process need data, then dB don't return null exception.
// Many Other functions of CommandLineRunner as well.
@Component
public class StudentDataLoader implements CommandLineRunner {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setId(7);
        student.setName("John Dang");
        student.setEmail("JohnDang@johndang.com");

        // it will check the DB first by using select query, if data already exit in dB then it will act as Update Query
        // if no data in dB then it will act as Insert Query.
        studentRepo.save(student);

    }
}
