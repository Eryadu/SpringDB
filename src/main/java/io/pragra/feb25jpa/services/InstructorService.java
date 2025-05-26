package io.pragra.feb25jpa.services;

import io.pragra.feb25jpa.entities.Instructor;
import io.pragra.feb25jpa.repo.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InstructorService {

    @Autowired
    InstructorRepo instructorRepo;

    public List<Instructor> getAllInstructors(){
        List<Instructor> instructorList = instructorRepo.findAll();
        return instructorList;
    }
}
